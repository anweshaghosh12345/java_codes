package Array;

public class Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length <= 2)
            return false;
        int i=0,j=Integer.MAX_VALUE,k=Integer.MAX_VALUE;
        while (i<nums.length){
            if(nums[i]<j){
                j=nums[i];
            }
            else if(j<nums[i] && nums[i]<k)
            {
                k=nums[i];
            }
            else if(k<nums[i]){
                return true;
            }
            i++;
        }
        return false;
    }
}
