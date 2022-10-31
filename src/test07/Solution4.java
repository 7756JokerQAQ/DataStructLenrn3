package test07;

import java.util.*;

public class Solution4 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new LinkedList<>();
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        //boolean used[] = new boolean[len];
        Deque<Integer> path = new ArrayDeque<Integer>();
        dfs(candidates, 0, len,  target,path, res);
        return res;
    }

    private void dfs(int[] candidates, int begin, int len, int target, Deque<Integer> path, List<List<Integer>> res) {
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        // 重点理解这里从 begin 开始搜索的语意
        for (int i = begin; i < len; i++) {
            path.addLast(candidates[i]);

            // 注意：由于每一个元素可以重复使用，下一轮搜索的起点依然是 i，这里非常容易弄错
            dfs(candidates,i,len,target-candidates[i],path,res);
            // 状态重置
            path.removeLast();
        }

    }


}
