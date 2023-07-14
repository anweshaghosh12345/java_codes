package Array;

import java.util.Arrays;

public class Find_Kth_Largest_Integer_in_Array {
    public String kthLargestNumber(String[] nums, int k) {

        Arrays.sort(nums,(a,b)->a.length());
        return (nums[nums.length-k]);
    }
}