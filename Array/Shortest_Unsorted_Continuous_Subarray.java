package Array;

import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] snums=nums.clone();
        Arrays.sort(snums);

        int start= snums.length-1;
        int end=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=snums[i]){
                start=Math.min(start,i);
                end=Math.max(end,i);
            }
        }
        if((end-start) >=0)
            return (end-start)+1;
        else
            return 0;
    }
}
