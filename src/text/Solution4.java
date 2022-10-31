package text;

public class Solution4 {
    public String multiply(String num1, String num2) {
        int k=Integer.valueOf(num1);
        String res=num1;
        while (k>0){
            res=add(res,num2);
            k--;
        }

       return res;
    }

    private String add(String num1,String num2){
        StringBuilder sb = new StringBuilder();
        int carry = 0, i = num1.length()-1, j = num2.length()-1;
        while(i >= 0 || j >= 0 || carry != 0){
            if(i>=0) carry += num1.charAt(i--)-'0';
            if(j>=0) carry += num2.charAt(j--)-'0';
            sb.append(carry%10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }
}
