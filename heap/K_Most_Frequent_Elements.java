package heap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class K_Most_Frequent_Elements {
    public static int[] KMostFrequent(int n, int k, int[] arr) {
        // Write your code here.
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i:arr){
            hashMap.put(n,hashMap.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->hashMap.get(a)-hashMap.get(b));
        for (int s:hashMap.keySet()){
            pq.add(s);
            if(pq.size()>k)
                pq.remove();
        }
        int[] ans=new int[k];
        for (int i = 0; i < k; i++) {
            ans[i]=pq.poll();
        }
        return ans;
    }
}
