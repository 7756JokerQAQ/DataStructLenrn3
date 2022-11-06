package lyc221102;

public class Solution4 {
    public double myPow(double x, int n) {
        //块速幂+递归
        long N=n;
        return N>=0?quickPow(x,N):1.0/quickPow(x,-N);
    }

    private double quickPow(double x, long n) {
        if(n==0){
            return 1.0;
        }
        double y=quickPow(x,n/2);
        //如果为偶数则不多成x反之就多成一个
        return n%2==0?y*y:y*y*y;

    }
}
