package lyc221101;

public class Solution3 {
    public int findNthDigit(int n) {
        String temp="";
        for (int i = 1; i <= n; i++) {
            temp+=i;
            if(temp.length()>=n){
                break;
            }

        }
        return temp.charAt(n-1)-'0';
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.findNthDigit(3));
    }
}
