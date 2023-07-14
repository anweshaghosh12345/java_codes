package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_smallest_element {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        //Your code here
        Arrays.sort(arr);
        return arr[k];
    }
}
/*
 PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((a,b)->a-b);
        for(int i=l;i<r;i++){
            priorityQueue.add(arr[i]);
        }

        int c=0;
        while (k-->0){
            c=priorityQueue.poll();

        }

        return c;
    }
}


 */