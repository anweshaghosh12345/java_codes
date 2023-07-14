package Array;

public class Next_Permutation {
    public void swap(int[]num,int i,int j){
        int temp=num[i];
        num[i]=num[j];
        num[j]=temp;
    }
    public void reverse(int[]num,int i,int j){
        while (i<j){
            swap(num,i++,j--);
        }
    }
    public void nextPermutation(int[] nums) {
      if(nums==null || nums.length<=1)
          return;
      int i=nums.length-2;
      while (i>=0 && nums[i]>=nums[i+1])
          i--;
      if(i>=0){
          int j=nums.length-1;
          while (nums[j]<=nums[i])
              j--;
         swap(nums,i,j);
      }
      reverse(nums,i+1,nums.length-1);
    }
}
