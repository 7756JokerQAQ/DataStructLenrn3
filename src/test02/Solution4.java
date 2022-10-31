package test02;

public class Solution4 {
    public String shortestPalindrome(String s) {
        String temp=s;
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int pre=0,cur=n-1;
        //ab   --->bab
        // ba
        boolean flag=true;
        for (int i = 0; i < n; i++) {
            if(s.charAt(cur)!=s.charAt(pre)){
                sb.append(s.charAt(cur));
                cur--;
                flag=true;
            }else if(s.charAt(cur)==s.charAt(pre)){
                sb.append(s.charAt(pre));
                pre++;
                cur--;
                flag=false;
            }
            if(flag){
                pre=0;
            }
        }
        for (int i = pre; i < n; i++) {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="aacecaaa";
        Solution4 solution4 = new Solution4();
        solution4.shortestPalindrome(s);
    }
}
