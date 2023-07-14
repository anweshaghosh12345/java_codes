package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Single_Number_III {
    public int[] singleNumber(int[] nums) {

        ArrayList<Integer> res=new ArrayList<Integer>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for (int i:nums) {
            if(hm.get(i)==1)
                res.add(i);
        }
        int[] ans=new int[res.size()];
        for(int i=0;i<2;i++){
            ans[i]=res.get(i);
        }
        return  ans;
    }
}
