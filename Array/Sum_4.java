package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        ArrayList<List<Integer>> res=new ArrayList<List<Integer>>();
        if(nums ==null || nums.length ==0 )
            return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int tar = target-nums[i]-nums[j];
                int left= j+1;
                int right = nums.length-1;
                while (left<right){
                    int two_sum = nums[left]+ nums[right];
                    if(two_sum==tar){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));

                        while (left<right && nums[left]== nums[left+1])
                            left++;
                        while (left<right && nums[right]== nums[right-1])
                            right--;
                        left++;
                        right--;
                    }
                   else if(two_sum<tar)
                        left++;
                    else {
                        right--;
                    }
                }
                while (j+1< nums.length && nums[j+1]==nums[j])
                    ++j;
            }
            while (i+1<nums.length && nums[i+1]== nums[i])
                ++i;
        }
        return res;
    }
}