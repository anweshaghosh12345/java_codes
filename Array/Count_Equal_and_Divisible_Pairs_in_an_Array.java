package Array;

public class Count_Equal_and_Divisible_Pairs_in_an_Array {
    public int countPairs(int[] nums, int k) {
        if(nums.length==0 || nums.length ==1)
            return 0;
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]==nums[j] && (i*j)%k==0){
                    c++;
                }
            }
        }
        return c;
    }
}
