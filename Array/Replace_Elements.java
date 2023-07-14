package Array;

import java.util.HashMap;

public class Replace_Elements {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],i);
        }
        for (int i = 0; i < operations.length; i++) {
            int num=operations[i][0];
            int replace=operations[i][1];

            int indx=hashMap.get(num);
            hashMap.remove(num);
            hashMap.put(replace,indx);
            nums[indx]=replace;

        }

        return nums;
    }
}
