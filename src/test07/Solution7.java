package test07;

import java.util.*;

public class Solution7 {
    //回溯算法
    public List<List<Integer>> permuteUnique(int[] nums) {
        int len=nums.length;
        List<List<Integer>> res=new ArrayList<>();
        if(len==0){
            return res;
        }
        Deque<Integer> path = new ArrayDeque<Integer>();
        boolean used[]=new boolean[len];
        Arrays.sort(nums);
        dfs(nums,len,0,path,used,res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {

        if(depth==len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if(used[i]||(i>0&&nums[i]==nums[i-1]&&used[i-1])){
                continue;
            }
            path.addLast(nums[i]);
            used[i]=true;
            dfs(nums,len,depth+1,path,used,res);
            //接着进行回溯
            path.removeLast();
            used[i]=false;
        }
    }


}
