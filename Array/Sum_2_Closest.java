package Array;

import java.util.Arrays;

public class Sum_2_Closest {
    public int threeSumClosest(int[] nums, int target) {
        int res=nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            int start=i+1;
            int end=nums.length-1;
            while (start<end){
                int cur_sum=nums[i]+nums[start]+nums[end];
                if(cur_sum>target){
                    end--;
                }else {
                    start++;
                }
                if(Math.abs(cur_sum-target) < Math.abs(res-target)){
                    res=cur_sum;
                }
            }
        }
        return res;
    }
}
