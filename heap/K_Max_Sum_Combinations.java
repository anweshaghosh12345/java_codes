package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_Max_Sum_Combinations {
    public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
        // Write your code here.
        PriorityQueue<Integer> pq=new PriorityQueue<>((an,bn)->bn-an);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pq.add(a.get(i)+b.get(j));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while (k >= 0) {
            ans.get(pq.poll());
            k--;
        }
        return ans;
    }
}
