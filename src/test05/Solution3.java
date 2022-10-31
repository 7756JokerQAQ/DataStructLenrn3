package test05;

public class Solution3 {
    public int totalHammingDistance(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                sum+=result(nums[i],nums[j]);
            }
        }
        return sum;
    }
    private int result(int x,int y){
        return Integer.bitCount(x^y);
    }
}
