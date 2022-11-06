package lyc221105;

import lyc221103.Solution6;

import java.util.ArrayDeque;
import java.util.Deque;


public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
      //  System.out.println(Integer.valueOf("-11"));
       // System.out.println(Integer.valueOf("*"));
        String expression = "|(&(t,f,t),!(t))";
        System.out.println(solution.parseBoolExpr(expression));
    }

    public boolean parseBoolExpr(String expression) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] charArray = expression.toCharArray();
        int n = charArray.length;
        for (int i = 0; i < n; i++) {
            if (charArray[i] == ',') {
                continue;
            } else if (charArray[i] != ')') {
                stack.push(charArray[i]);
            }
            if (charArray[i] == ')') {
                int countF = 0;
                int countT = 0;
                while (stack.peek() != '(') {
                    char temp = stack.peek();
                    if (temp == 'f') {
                        countF++;
                    } else if (temp == 't') {
                        countT++;
                    }
                    stack.pop();
                }
                stack.pop();
                char flag = stack.pop();
                if (flag == '|') {
                    if (countT != 0) {
                        stack.addFirst('t');
                    } else {
                        stack.addFirst('f');
                    }
                } else if (flag == '&') {
                    if (countF != 0) {
                        stack.addFirst('f');
                    } else {
                        stack.addFirst('t');
                    }
                } else if (flag == '!') {
                    if (countT == 0 && countF == 1) {
                        stack.addFirst('t');
                    } else if (countT == 1 && countF == 0) {
                        stack.addFirst('f');
                    }
                }
            }
        }
        return stack.pop() == 't';
    }
}
