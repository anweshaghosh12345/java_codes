package Hash;

import java.util.HashMap;
import java.util.Hashtable;

public class Max_Number_of_K_Sum_Pairs {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hashtable=new HashMap<>();
        int c=0;
        for (int i=0;i<nums.length;i++){
            if(hashtable.containsKey(k-nums[i]) && hashtable.get(k-nums[i])>0)
            {
                c ++;
                hashtable.put(k-nums[i],hashtable.get(k-nums[i])-1);
            }else {
                hashtable.put(nums[i],hashtable.getOrDefault(nums[i],0)+1);
            }
        }
        return c;
    }
}