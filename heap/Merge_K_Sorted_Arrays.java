package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Merge_K_Sorted_Arrays {
    public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
    {
        // Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        ArrayList<Integer> a;
        for (int i = 0; i < k; i++) {
            a=new ArrayList<>(kArrays.get(i));
            for (int j = 0; j < a.size(); j++) {
                pq.add(a.get(j));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while (!pq.isEmpty()){
            ans.add(pq.poll());
        }
        return ans;
    }
}
