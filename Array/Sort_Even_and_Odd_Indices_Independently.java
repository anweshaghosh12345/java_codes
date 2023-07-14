package Array;

public class Sort_Even_and_Odd_Indices_Independently {
    public int[] sortEvenOdd(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if(i%2==0){
                if(nums[i]>nums[i+2]){
                    int temp=nums[i];
                    nums[i]=nums[i+2];
                    nums[i+2]=temp;
                }
            }
            else {
                if(nums[i]<nums[i+2]){
                    int temp=nums[i];
                    nums[i]=nums[i+2];
                    nums[i+2]=temp;
                }
            }
        }
        return nums;
    }
}