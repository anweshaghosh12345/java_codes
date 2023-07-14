package Hash;

import java.util.HashMap;

public class Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        if(nums.length%2!=0)
            return false;
        HashMap<Integer,Integer> hm=new HashMap<>();

        for (Integer e:nums) {
            hm.put(e,hm.getOrDefault(e,0)+1);
        }
        for (Integer a : hm.keySet()) {
            if(hm.get(a)%2 !=0){
                return false;
            }
        }
        return true;
    }
}