package text;

import java.math.BigInteger;

public class Solution3 {
    public String addStrings(String num1, String num2) {
        int pre1 = num1.length() - 1;
        int pre2 = num2.length() - 1;
        int in = 0;
        String res = "";
        while (pre1 >= 0 && pre2 >= 0) {
            int sum = (num1.charAt(pre1) - '0') + in + (num2.charAt(pre2) - '0');
            if (sum <= 9) {
                res = sum + res;
                in = 0;
            } else {
                sum = sum - 10;
                res = sum + res;
                in = 1;
            }
            pre1--;
            pre2--;
        }
        if (pre1 == -1 && pre2 >= 0) {
            while (pre2 >= 0) {
                int sum2 = (num2.charAt(pre2) - '0') + in;
                if (sum2 <= 9) {
                    res = sum2 + res;
                    in = 0;
                } else {
                    sum2 = sum2 - 10;
                    res = sum2 + res;
                    in = 1;
                }
                pre2--;
            }
        }
        if (pre2 == -1 && pre1 >= 0) {
            while (pre1 >= 0) {
                int sum2 = (num1.charAt(pre1) - '0') + in;
                if (sum2 <= 9) {
                    res = sum2 + res;
                    in = 0;
                } else {
                    sum2 = sum2 - 10;
                    res = sum2 + res;
                    in = 1;
                }
                pre1--;
            }
        }
        if (in == 1) {
            res = in + res;
        }

        return res;
    }

    public static void main(String[] args) {
        String s = "1";
        String s1 = "9";
        Solution3 solution3 = new Solution3();
        solution3.addStrings(s, s1);
    }
    /*

     public String addStrings(String num1, String num2) {
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
     */
}
