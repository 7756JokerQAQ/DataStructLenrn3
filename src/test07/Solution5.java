package test07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution5 {
    //回溯算法
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len=candidates.length;
        List<List<Integer>> res=new ArrayList<>();
       if(len==0){
           return res;
       }
        Deque<Integer> path = new ArrayDeque<Integer>();
        dfs(candidates,0,len,path,res,target);
        return res;
    }

    private void dfs(int[] nums,int begin, int len, Deque<Integer> path, List<List<Integer>> res,int target) {
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {

            path.addLast(nums[i]);
            target-=nums[i];

            //保持每次的回调不从头开始 否则就会出现重复
            dfs(nums,i,len,path,res,target);
            //接着进行回溯
            path.removeLast();
            target+=nums[i];
        }
    }

    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        int []arr={2,3,6,7};
        solution5.combinationSum(arr,7);
    }


}
