package test06;

public class Solution3 {
    public int trailingZeroes(int n) {
        //该题主要求质因数10的个数所以可以转换思路
        int ant=0;
        for (int i =5; i <=n; i+=5) {
            for (int j = i; j %5==0 ; j/=5) {
                ++ant;
            }
        }

        return ant;
    }

    public static void main(String[] args) {

        int n=10;
        Solution3 solution3 = new Solution3();
        solution3.trailingZeroes(25);
    }
}
