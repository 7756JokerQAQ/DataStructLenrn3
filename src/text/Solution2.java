package text;

import java.util.Stack;

public class Solution2 {
    public String addBinary(String a, String b) {
        int in=0;
        Stack<String> stack = new Stack<>();
        if(a.length()<b.length()){
            String temp="";
            for (int i = 0; i < b.length() - a.length(); i++) {
               temp+='0';
            }
            a=temp+a;
        }else  if(a.length()>b.length()){
            String temp="";
            for (int i = 0; i < a.length() - b.length(); i++) {
                temp+='0';
            }
            b=temp+b;
        }
        int i=a.length()-1;
        while (i>=0){
            int num=(a.charAt(i)-'0')+(b.charAt(i)-'0')+in;
            if(num==0){
                stack.push("0");
                in=0;
            }else if(num==1){
                stack.push("1");
                in=0;
            }else if(num==2){
                stack.push("0");
                in=1;
            }else {
                stack.push("1");
                in=1;
            }
            i--;
        }
        if(in==1){
            stack.push("1");
        }
       String res="";
        for (String s:
             stack) {
            res=s+res;
        }

        return res;
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        Solution2 solution2 = new Solution2();
        solution2.addBinary(a,b);
    }
}
