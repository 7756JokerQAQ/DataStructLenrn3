package lyc221103;

public class Solution4 {
    public int reachNumber(int target) {
        int result = 0, num = 0, t = Math.abs(target); // 由于target有负数情况，为了统一计算逻辑，所以取绝对值
        // 直到num值大于等于t，并且num减t是偶数，才结束while循环
        while (num < t || (num - t) % 2 != 0)
            num += ++result;   // num=1+2+3+4+……
        return result;
    }

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.reachNumber(5));
    }
}
