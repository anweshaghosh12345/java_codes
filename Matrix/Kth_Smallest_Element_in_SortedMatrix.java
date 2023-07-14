package Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_in_SortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i = 0; i <matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.add(matrix[i][j]);
            }
        }
        int s=k-1;
        while (s>0){
            pq.poll();
            s--;
        }
        return pq.poll();
    }
}