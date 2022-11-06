package lyc221103;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution5 {
    public String simplifyPath(String path) {
        String[] names = path.split("/");
        //定义一个队列容器
        Deque<String> stack = new ArrayDeque<>();
        for (String str :
                names) {
            if ("..".equals(str)) {
                if (!stack.isEmpty()) {
                    stack.removeLast();
                }
                //去除空字符串和"."
            } else if (str.length() > 0 && !".".equals(str)) {
                stack.addLast(str);
            }
        }
        StringBuilder sb=new StringBuilder();
        if(stack.isEmpty()){
           sb.append("/");
        }else {
            while (!stack.isEmpty()){
                sb.append("/");
                sb.append(stack.pollFirst());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       String  input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
       String str="\n";
        System.out.println(str.length());;
        System.out.println(input.length());
        System.out.println(input);
    }
}
