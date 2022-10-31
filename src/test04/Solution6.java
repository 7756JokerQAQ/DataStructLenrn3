package test04;

public class Solution6 {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        int temp = n;
        while (temp > 0) {
            int res = temp % 2;
            if (res != 0) {
                return false;
            }
            temp /= 2;
            if(temp==1){
                break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=16;
        Solution6 solution6 = new Solution6();
        solution6.isPowerOfTwo(16);
    }
}
