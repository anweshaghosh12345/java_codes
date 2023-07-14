package Array;

import java.util.ArrayList;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int n =nums.length;
        int[] ans1=new int[2*n];
        ArrayList<Integer>  ans=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            ans.add(nums[i]);
        }
        for (int i = 0; i < n; i++) {
            ans.add(nums[i]);
        }
        for (int i = 0; i < ans.size(); i++) {
            ans1[i]=ans.get(i);
        }
        return ans1;
    }
}
