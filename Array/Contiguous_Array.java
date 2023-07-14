package Array;

import java.util.HashMap;

public class Contiguous_Array {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int max_length=0;
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==1){
                c++;
            }else if(nums[i]==0) {
                c--;
            }
            if(map.containsKey(c)){
                max_length=Math.max(i-map.get(c),max_length);
            }
            else {
        map.put(c,i);
            }

        }
        return max_length;
    }
}
