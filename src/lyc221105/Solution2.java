package lyc221105;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.regex.Pattern;

public class Solution2 {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Deque<Integer>stack=new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if(tokens[i].equals("*")){
                int num1=stack.pop();
                stack.push(num1*stack.pop());
            }else if(tokens[i].equals("/")){
                int num1=stack.pop();
                stack.push(stack.pop()/num1);
            }else if(tokens[i].equals("+")){
                int num1=stack.pop();
                stack.push(num1+stack.pop());
            }else if (tokens[i].equals("-")){
                int num1=stack.pop();
                stack.push(stack.pop()-num1);
            }else {
                    stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.peek();
    }


    public static void main(String[] args) {
        String tokens[] = {"2","1","+","3","*"};
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.evalRPN(tokens));
    }
}
