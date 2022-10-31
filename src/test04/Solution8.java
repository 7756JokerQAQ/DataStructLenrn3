package test04;

public class Solution8 {
    public String convertToBase7(int num) {
        //100%7 =14..2
        int sing = 1;
        if (num < 0) {
            sing = -1;
          num=  Math.abs(num);
        }
        String res = "";
        while (num != 0) {
            int temp = num % 7;
            res = temp + res;
            num /= 7;
        }
        if (sing == -1) {
            res = "-" + res;
        }
        return res;

    }
}
