package Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Intersection_of_Two_Arrays_II {
    public int[] intersect(int[] nums1, int[] nums2) {

        ArrayList<Integer> arr=new ArrayList<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        int n1=nums1.length;
        int n2=nums2.length;
        for (int i = 0; i < n1; i++) {
            hm1.put(nums1[i], hm1.getOrDefault(nums1[i],0)+1);
        }

        for (int i = 0; i < n2; i++) {
            hm2.put(nums2[i],hm2.getOrDefault(nums2[i],0)+1);
        }
        for(Integer k: hm1.keySet()){
            if(hm2.containsKey(k)){
                int x=Math.min(hm1.get(k),hm2.get(k));
                while (x-->0)
                    arr.add(k);
            }
        }
    int [] res=new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            res[i]=arr.get(i);
        }
        return res;
    }
}
