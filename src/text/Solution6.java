package text;

import java.util.ArrayList;
import java.util.List;

public class Solution6 {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        List<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int k = 0;
        int flag = 1;
        for (int i = 0; i < s.length(); i++) {
            if (k < numRows && flag == 1) {
                list.get(k).append(s.charAt(i));
                k++;
            } else if (k >= 0 && flag == -1) {
                list.get(k).append(i);
                k--;
            }
            if (k == numRows) {
                k = k - 2;
                flag = -1;
            } else if (k == -1) {
                k += 2;
                flag = 1;
            }
        }
        String res = "";
        for (StringBuilder stringBuilder :
                list) {
            res += stringBuilder;
        }
        return res;
    }
}
