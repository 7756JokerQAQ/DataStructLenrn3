package test04;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution5 {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int prxNum[] = new int[n + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            prxNum[i + 1] = prxNum[i] + nums[i];
        }
        int res = n + 1;
        for (int i = 0; i <= n; i++) {
            long cunSum = prxNum[i];
            while (!deque.isEmpty() && cunSum - prxNum[deque.peekFirst()] >= k) {
                res = Math.min(res, i - deque.removeFirst());
            }
            while (!deque.isEmpty() && prxNum[deque.peekLast()] >= cunSum) {
                deque.removeLast();
            }
            deque.addLast(i);
        }
        return res < n + 1 ? res : -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, -1, 2, 5};
        int k = 3;
        Solution5 solution5 = new Solution5();
        solution5.shortestSubarray(arr, k);
    }
}


