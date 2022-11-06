package lyc221102;


import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Solution2 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            ;return res;
        }
        Deque<List<Node>> stack = new ArrayDeque<>();
        stack.addLast(root.children);

        List<Integer> qq = new ArrayList<>();
        qq.add(root.val);
        res.add(qq);
        int count=1;
        while (!stack.isEmpty()){
            List<Integer> q1=new ArrayList<>();
            int tempCount=0;
            while (count>0) {

                for (Node node :
                        stack.removeFirst()) {
                    q1.add(node.val);
                    stack.addLast(node.children);
                    tempCount++;
                }
                count--;
            }
            if(!q1.isEmpty()) {
                res.add(q1);
                count=tempCount;
            }
        }
    return res ;
    }

}
