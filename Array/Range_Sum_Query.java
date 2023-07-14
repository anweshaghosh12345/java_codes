package Array;

public class Range_Sum_Query {
    int[] prefixsum=null;
    public Range_Sum_Query(int[] nums) {
        prefixsum = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            prefixsum[i+1]=prefixsum[i]+nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefixsum[right+1]-prefixsum[left];
    }
}
