package test05;

public class Solution {
    public int arraySign(int[] nums) {
        int countNegative=0;
        int countZero=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0){
                countNegative++;
            }else  if (nums[i]==0){
                countZero=1;
                break;
            }
        }
        if(countZero==1){
            return 0;
        }
        if(countNegative%2==0){
            return 1;
        }


        return -1;

    }
}
