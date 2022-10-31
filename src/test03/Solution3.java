package test03;

public class Solution3 {
    private int Max = Integer.MAX_VALUE;
    private int Min = Integer.MIN_VALUE;
        public int reverse(int x) {
            int sing = 1;

            if (x < 0) {
                sing = -1;
               x= Math.abs(x);
            }
            int sum=0;
            boolean flag=false;
            char[] temp = String.valueOf(x).toCharArray();
            for (int i = temp.length-1; i>=0; i--) {
                if(sum<=Max){
                   sum=sum*10+(temp[i]-'0');
                   if(sum>Max/10){
                       flag=true;
                   }
                }
            }
            if(sing==1&& !flag){
                return sum;
            }
            if(sing==-1&&!flag){
                return sum*sing;
            }
            return 0;

    }

    public static void main(String[] args) {
        int a=-2147483412;
        Solution3 solution3 = new Solution3();
        solution3.reverse(a);
    }
}
