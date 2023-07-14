package Array;

import java.util.Arrays;

public class Min_Max_Pair_Sum_in_Array {
    public int minPairSum(int[] nums) {
//        int[] arr=new int[nums.length/2];
        Arrays.sort(nums);
        int end=nums.length-1;
        int max=0;
        for (int i = 0; i < nums.length/2; i++) {
            max=Math.max(max,nums[i]+nums[end--]);
        }
        return max;
    }
}
