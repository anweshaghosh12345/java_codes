package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Sum_4_II {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int c=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i:nums1){
            for (int j: nums2)
                hashMap.put(i+j,hashMap.getOrDefault(i+j,0)+1);
        }
        for (int k: nums3){
            for (int l: nums4){
                c+=hashMap.getOrDefault(-(l+k),0);
            }
        }
        return  c;
    }
}
