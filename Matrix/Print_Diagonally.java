package Matrix;

import java.util.ArrayList;

public class Print_Diagonally {
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<N;i++){
            int j=0;
            int k=i;
            while(j<N && k>=0){
                ans.add(A[j][k]);
                k--;
                j++;
            }
        }
        for(int i=1;i<N;i++){
            int x=i;
            int y=N-1;
            while (x<N && y>=0){
                ans.add(A[x][y]);
                x++;
                y--;
            }
        }
        return ans;
    }
}
