package Array;

public class Monotonic_Array {
    public boolean isMonotonic(int[] nums) {
            boolean increse=true;
            boolean decrease=true;
            for (int i = 1; i < nums.length; i++) {
                if(nums[i-1]>nums[i]){
                    decrease=false;
                }
                if(nums[i-1]<nums[i]){
                    increse=false;
                }

            }
            if(decrease)
                return decrease;
            else {
                return increse;
            }
    }
}
