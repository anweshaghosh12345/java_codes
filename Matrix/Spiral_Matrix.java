package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int  r=matrix.length;
        int  c=matrix[0].length;
        ArrayList<Integer> arrayList=new ArrayList<>();
        int k=0,l=0;
        while (k<r && l<c){
            for (int i=l;i<=c-1;i++)
                arrayList.add(matrix[k][i]);
            k++;
            for (int i = k; i <=r-1 ; i++) {
                arrayList.add(matrix[i][c-1]);
            }
            c--;
            if(k<r) {
                for (int i = c - 1; i >= l; --i) {
                    arrayList.add(matrix[r - 1][i]);
                }
                r--;
            }
            if(l<c) {
                for (int i = r - 1; i >= k; --i)
                    arrayList.add(matrix[i][l]);

                l++;
            }

        }
        return arrayList;
    }
}