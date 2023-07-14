package heap;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        int n=nums.length;
        for (int i = 0; i < n; i++) {
            pq.add(nums[i]);
        }
        int f=k-1;
        while (f>0){
            pq.remove();
            f--;
        }
        return pq.remove();
    }
}
