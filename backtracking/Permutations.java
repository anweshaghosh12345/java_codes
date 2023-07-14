package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations
{
    List<List<Integer>> lists=new ArrayList<>();
    public List<List<Integer>> permute(int[] nums)
    {
        List<Integer>  ar=new ArrayList<>();
        permutation(nums,0,ar);
        return lists;
    }
    private void permutation(int[] nums,int idx,List<Integer> ar){
        if(idx== nums.length) {
            lists.add(new ArrayList<>(ar));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(ar.contains(nums[i]))
                continue;
            ar.add(nums[i]);
            permutation(nums,idx+1,ar);
            ar.remove(ar.size()-1);
        }

    }
}
