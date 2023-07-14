package Hash;

public class Largest_Number_At_Least_Twice_of_Others {
    public int dominantIndex(int[] nums) {
        if(nums.length==1)
            return 0;
        int max=-1;
        int index=0;
        for ( int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }

        }
        for (int m:nums){
            if(max==m || max >=2*m){
                continue;
            }
            else {
                return -1;
            }
        }
        return index;
    }
}
