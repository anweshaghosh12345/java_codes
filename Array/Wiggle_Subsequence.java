package Array;

public class Wiggle_Subsequence {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length <2)
            return nums.length;
        int high=1;
        int low =1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1])
                high=low+1;
            else if(nums[i]<nums[i-1])
                low=high+1;
        }
        return Math.max(low,high);
    }
}