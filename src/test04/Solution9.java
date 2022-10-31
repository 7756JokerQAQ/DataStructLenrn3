package test04;

public class Solution9 {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }
        int[] factors = new int[]{2, 3, 5};
        for (int factor :
                factors) {
            while (n % factor == 0) {
                n /= factor;
            }
        }
        if (n == 1) {
            return true;
        } else {
            return false;
        }
    }
}
