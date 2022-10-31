package test04;

public class Solution7 {
    public boolean isPowerOfFour(int n) {

        return n > 0 && (n>>1 & (n - 1)>>1) == 0;
    }
}
