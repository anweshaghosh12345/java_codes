package Hash;

import java.util.HashMap;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
       int m=nums.length/2;
        int c=0;
        for (int i : hm.keySet()) {
            if(hm.get(i)>m)
                c=i;
        }
        return  c;
    }
}
