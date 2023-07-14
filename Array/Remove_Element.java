package Array;

public class Remove_Element {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i]==val){
                nums[i]=nums[n-1];
            }
        }
        return n;
    }
}
