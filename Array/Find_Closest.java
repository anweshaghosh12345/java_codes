package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Closest {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE, num = 0;
        for(int i=0 ;i<nums.length;i++) {
            if(min > Math.abs(nums[i])) {
                min = Math.abs(nums[i]);
                num = nums[i];
            } else if(min == Math.abs(nums[i]) && num < nums[i]) {
                num = nums[i];
            }
        }
        return num;
    }
}
