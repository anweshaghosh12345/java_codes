package Array;

import java.util.Arrays;

public class Kth_Largest_Element_in_Array {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k-1];
    }
}

// 1 2 3 4 5 6