package lyc221103;

import java.util.*;

public class Solution2 {
    int []num=new int[1010];
    public int calPoints(String[] operations) {
      int n=operations.length,pre=0;
        for (int i = 0; i < n; i++,pre++) {
            if(operations[i].equals("+")){
                num[pre]=num[pre-1]+num[pre-2];
            }else if(operations[i].equals("C")){
                pre-=2;
            }else if(operations[i].equals("D")){
                 num[pre]=2*num[pre-1];
            }else {
                num[pre]=Integer.parseInt(operations[i]);
            }
        }
        int ant=0;
        for (int i = 0; i < n; i++) {
            ant+=num[i];
        }
        return ant;
    }

    public static void main(String[] args) {
        String s[]={"5","-2","4","C","D","9","+","+"};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.calPoints(s));
    }
}
