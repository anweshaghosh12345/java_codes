package Matrix;

import java.util.*;
import java.util.ArrayList;

public class Sort_Matrix_Diagonally {
    public int[][] diagonalSort(int[][] mat) {
//       / ArrayList<ArrayList<Integer>> arrayList;
        int r=mat.length;
        int c=mat[0].length;
//        row=0;
        for (int i = 0; i < c; i++) {
//            arrayList=new ArrayList<>();
            sort(mat,0,i,r,c);
        }
//        col=0
        for (int j = 1; j < r; j++) {
            sort(mat,j,0,r,c);
        }
        return mat;
    }
    void sort(int[][] mat,int row,int col,int m,int n){
//        List<Integer> values=new ArrayList<>();
        int[] values=new int[101];
        int r=row,c=col;
        while (r<m && c<n){
            values[mat[r][c]]++;
            r++;
            c++;
        }
//        Collections.sort(values);
        r=row;
        c=col;
//        int indx=0;
        for (int i = 1; i <101 ; i++) {
            if(values[i]>0){
                int count=values[i];
                while (count-->0){
                    mat[r][c]=i;
                    r++;
                    c++;
                }
            }
        }
//        while (r<m && c<n){
//            mat[r][c]=values.get(indx++);
//            r++;
//            c++;
//        }
    }
}
