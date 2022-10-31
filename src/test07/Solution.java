package test07;


import LinkedList_.LinkedList;
import sun.misc.Queue;

public class Solution {
    class Node{
       private char a;
       private int b;

        public Node() {
        }

        public Node(char a, int b) {
            this.a = a;
            this.b = b;
        }

        public char getA() {
            return a;
        }

        public int getB() {
            return b;
        }

    }

    public int maximumSwap(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        LinkedList<Node> list = new LinkedList<>();
        int max=chars[0];
        list.addFirst(new Node(chars[0],0));
        for (int i = 1; i < chars.length; i++) {
            if(chars[i]>max){
                list.addFirst(new Node(chars[i],i));
                max=chars[i];
            }else {
                list.addLast(new Node(chars[i],i));
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==list.getFirst().a){
                list.removeFirst();
            }else if(chars[i]<list.getFirst().a){
                int k=list.getFirst().b;
                char temp=chars[i];
                chars[i]=chars[k];
                chars[k]=temp;
                break;
            }
        }
        int sum=0;
        for (int i = 0; i < chars.length; i++) {
            sum=sum*10+(chars[i]-'0');
        }
        return sum;
    }

    public static void main(String[] args) {
        int a=98368;
        Solution solution = new Solution();
        System.out.println(solution.maximumSwap(a));
    }
}
