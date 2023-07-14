package Array;

import java.util.Arrays;

public class Valid_Triangle_Number {
    public int triangleNumber(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for (int i = 2; i <nums.length ; i++) {
            int l=0,r=i-1;
            while (l<r){
                if(nums[l]+nums[r]>nums[i]){
                    count+=r-l;
                    r--;
                }else {
                    l++;
                }
            }
        }
        return count;
    }
}
/*
for (int a = 0; a <nums.length-2 ; a++) {
            for (int b = a+1; b < nums.length-1; b++) {
                for (int c =b+1 ; c <nums.length ; c++) {
                    if(nums[a]+nums[b]>nums[c]&&
                    nums[b]+nums[c]>nums[a]&&
                    nums[c]+nums[a]>nums[b]){
                        count++;
                    }
                }
            }
        }
 */