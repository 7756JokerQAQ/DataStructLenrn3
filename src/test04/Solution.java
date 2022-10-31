package test04;

public class Solution {
    //首先将最大和最小的值给定义出来
    private int Max = Integer.MAX_VALUE;
    private int Min = Integer.MIN_VALUE;

    public int reverse(int x) {
        //记录翻转的和
        int rev = 0;
        while (x != 0) {
            //这个需要提前的进行终结否则将会越界 如果越界的话就直接退出
            if (rev < Min / 10 || rev > Max / 10) {
                return 0;
            }
            //得到该数字的余数
            int digit = x % 10;
            //将该数字缩小十倍
            x /= 10;
            rev = rev * 10 + digit;
        }
        return rev;
    }
}