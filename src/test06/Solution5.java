package test06;

public class Solution5 {
    public int addDigits(int num) {
        int sum=0;
        while (num!=0){
            sum+=num%10;
            num/=10;
            if(num==0&&sum>10){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}
