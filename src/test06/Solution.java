package test06;
import java.util.Stack;

public class Solution {

    public int sumSubarrayMins(int[] arr) {
        //可以利用dp栈
        int temp[]=new int[arr.length+1];
        int dp[]=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            temp[i+1]=arr[i];
        }
        long sum=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < temp.length; i++) {
            while (temp[stack.peek()]>temp[i]){
                stack.pop();
            }
            int j=stack.peek();
            dp[i]=dp[j]+(i-j)*temp[i];
            stack.add(i);
        }
        for (int i = 0; i < temp.length; i++) {
            sum+=dp[i];
        }
        return (int)(sum%(1000000007));
    }

    public static void main(String[] args) {
        int arr[]={3,1,2,4};
        Solution solution = new Solution();
        System.out.println(solution.sumSubarrayMins(arr));
    }

}
