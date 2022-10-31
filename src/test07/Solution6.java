package test07;

import java.util.*;

public class Solution6 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //每个数字在每个组合中只能使用 一次
        int len=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
       //定义一个使用的数组
        boolean used[]=new boolean[len];
        //再定义一个栈来存放经过的路径
        Deque<Integer> path = new ArrayDeque<Integer>();
        //接着调用算法dfs深度有限遍历
        Arrays.sort(candidates);
        dfs(candidates,len,0,path,used,res,target);
        return res;

    }

    private void dfs(int[] candidates, int len, int begin, Deque<Integer> path, boolean[]used,List<List<Integer>> res, int target) {

    if(target==0){
        res.add(new ArrayList<>(path));
        return;
    }
        // 大剪枝：减去 candidates[i] 小于 0，减去后面的 candidates[i + 1]、candidates[i + 2] 肯定也小于 0，因此用 break
        for (int i = begin; i < len; i++) {
            if (target - candidates[i] < 0) {
                break;
             }
            // 小剪枝：同一层相同数值的结点，从第 2 个开始，候选数更少，结果一定发生重复，因此跳过，用 continue

            if (i > begin && candidates[i] == candidates[i - 1]) {
                continue;
            }
            //没使用过的进入路径
            path.addLast(candidates[i]);
            //接着递归调用下一层
            dfs(candidates,len,i+1,path,used,res,target-candidates[i]);
            //开始回溯
            path.removeLast();
        }
    }
}
