package lyc221101;

public class Solution2 {
    public int countNumbersWithUniqueDigits(int n) {
       //0~9
        //10~99
        //100~999
        if(n==0){
            return 1;
        }
        int sum=1;
        int k=1;
        while (k<=n){
            int temp=9;
            for (int i = 1; i < k; i++) {
                temp*=(10-i);
            }
            sum+=temp;
            k++;
        }
        return sum;
    }
    //10*9*8=721
    //729

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.countNumbersWithUniqueDigits(3));
    }
}
