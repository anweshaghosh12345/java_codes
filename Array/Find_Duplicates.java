package Array;
import java.util.*;
public class Find_Duplicates {
    public List<Integer> findDuplicates(int[] nums) {
        int[] ar=new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            ar[nums[i]]++;
        }
        List<Integer> ans=new ArrayList<>();

        for (int i = 0; i < ar.length; i++) {
            if(ar[i]>1){
                ans.add(i);
            }
        }

        return ans;
    }
}
