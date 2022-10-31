package test05;

public class Solution4 {
    public boolean hasAlternatingBits(int n) {
       int x=n&1;
       n>>=1;
       while (n!=0){
           int y=n&1;
           n>>=1;
           if(y==x){
               return  false;
           }else {
               x=y;
           }
       }
       return true;

    }
}
