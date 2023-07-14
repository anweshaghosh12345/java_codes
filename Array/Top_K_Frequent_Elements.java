package Array;

import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Queue;

public class Top_K_Frequent_Elements {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res=new int[k];
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1 );
        }
        Queue<Integer> heap=new PriorityQueue<>((n1,n2) -> hashMap.get(n1)-hashMap.get(n2));
         for (int n:hashMap.keySet()){
             heap.add(n);
             if(heap.size()>k)
                 heap.poll();
         }
        for (int i = 0; i < k; i++) {
            res[i]=heap.poll();
        }
        return res;
    }
}
