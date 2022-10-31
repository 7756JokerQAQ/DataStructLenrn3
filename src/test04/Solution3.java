package test04;

public class Solution3 {
    long sum=0;
    public int largestPalindrome(int n) {
        for (int i = 2*n-2; i >= 0; i--) {
            int num1=i/2,num2=i/2+i%2;
           if( check(num1,num2)){
            return (int) sum/1337;
           }
        }
        return 0;
    }
    private boolean check(int num1,int num2){
        long temp=num1*num2;
        String s = Long.toString(temp);
        int pre=0,qre=s.length()-1;
        while (pre<=qre){
            if(s.charAt(pre++)!=s.charAt(qre--)){
                return false;
            }
        }
        sum=temp;
        return true;

    }
}
