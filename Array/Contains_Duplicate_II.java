package Array;

public class Contains_Duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=1;
        for(int i=0;i<nums.length;i++)
        {  j=1;
            while(j<=k)
            {
                if((i+j)<nums.length && nums[i]==nums[i+j])
                    return true;
                j++;
            }

        }
        return false;
    }
}

/*
for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j] && Math.abs(i-j)<=k) {
                    return true;
                }
            }
        }
 */