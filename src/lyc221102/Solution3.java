package lyc221102;

public class Solution3 {
    public boolean checkPerfectNumber(int num) {
    int k=(int) Math.sqrt(num);
    int sum=0;
        for (int i = 1; i <= k; i++) {
           if(num%i==0){
               sum=sum+i+num/i;
           }
        }
        Math.pow(1,2);
        sum-=num;
        if(sum==num){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        solution3.checkPerfectNumber(28);
    }
}
