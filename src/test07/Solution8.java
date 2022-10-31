package test07;

import java.util.*;

public class Solution8 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res = new LinkedList<>();
        if (len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<Integer>();

        boolean[] used = new boolean[len];
        Arrays.sort(nums);
        dfs(nums, len, 0, path, used, res);
        Deque<Integer>path2=new ArrayDeque<>();

        return res;


    }

    private void dfs(int[] nums, int len, int begin, Deque<Integer> path, boolean[] used, List<List<Integer>> res) {
        res.add(new ArrayList<>(path));
        if (begin >= len) {
            return;
        }

        for (int i = begin; i < len; i++) {
            //如果当前的数和上一个数字相同而且未被用过 则直接跳过
            if ( (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            path.addLast(nums[i]);
            dfs(nums, len, i + 1, path, used, res);
            path.removeLast();
            used[i] = false;
        }

    }
}
