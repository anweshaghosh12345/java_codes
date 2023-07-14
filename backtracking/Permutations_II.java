package backtracking;
import java.util.*;
public class Permutations_II {
    void func(int c,int[] nums,HashSet<List<Integer>> ans){
        if(c==nums.length){
            List<Integer> ds=new ArrayList<>();
            for (int n:nums)
                ds.add(n);
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = c; i < nums.length; i++) {
            swap(nums,c,i);
            func(c+1,nums, ans);
            swap(nums,c,i);
        }
    }
    void swap(int[]nums,int start,int end){
        int temp;
        temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans=new HashSet<>();
//        boolean[]map=new boolean[nums.length];
        func(0,nums,ans);
        List<List<Integer>> ans1=new ArrayList<>();
        for (List n:ans){
            ans1.add(n);
        }
        return ans1;
    }
}
