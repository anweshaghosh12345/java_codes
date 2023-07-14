package Array;

public class Sort_Array_By_Parity {
    public int[] sortArrayByParity(int[] nums) {

        int i=0,j=nums.length-1;
        while (i<j){
            if(nums[i]%2>nums[j]%2)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            if(nums[i]%2==0){
                i++;
            }
            if(nums[j]%2==0)
                j++;
        }
        return nums;
    }
}
