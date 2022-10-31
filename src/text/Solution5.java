package text;

public class Solution5 {
    public String licenseKeyFormatting(String s, int k) {
        int n=s.length();
        String  res="";
        int count=0;
        for (int i = n-1; i >= 0  ; i--) {
            if(count<k&&s.charAt(i)!='-'){
                res=s.charAt(i)+res;
                count++;
            }
            if(count==k&&i!=0&&s.charAt(i-1)!='-'){
                res='-'+res;
                count=0;
            }
        }
        return res.toUpperCase();
    }

    public static void main(String[] args) {
        String S = "--a-a-a-a--";
        int  k = 2;
        Solution5 solution5 = new Solution5();
        solution5.licenseKeyFormatting(S,k);
    }
}
