package Array;

import java.util.*;

public class Lonely_Numbers {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            hm.put(nums[i],
                    hm.getOrDefault(nums[i],0)+1 );
        }
        for (int num:nums) {
            if(hm.get(num)==1 && !hm.containsKey(num+1) && !hm.containsKey(num-1))
                ans.add(num);
        }
        return ans;
    }
}
