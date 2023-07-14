package Array;

public class Maximum_Difference {
    public int maximumDifference(int[] nums) {
        int max=0;
        int left =0;
        int right;

        for (right = 1; right <nums.length ; right++) {
            if(nums[right]<nums[left])
                left=right;
            max=Math.max((nums[right]-nums[left]),max);
        }
        if(max==0)
            return -1;
        else
        return max;
    }
}
