package Matrix;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
class pair{
    int row;
    int col;
    int time;
     pair(int row, int col,int time){
         this.row=row;
         this.col=col;
         this.time=time;
     }
}
public class rotten_oranges {
    public int orangesRotting(int[][] grid) {
    Queue<pair> queue = new LinkedList<>();
    int m = grid.length;
    int n = grid[0].length;

    int [][] vis=new int[m][n];
    int cntfresh=0;
    for (int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            if(grid[i][j]==2){
                queue.add(new pair(i,j,0));
                vis[i][j]=2;
            }else{
                vis[i][j]=0;
            }
            if(grid[i][j]==1)
                cntfresh++;
        }
    }
    int time=0;
    int[] drow={-1,0,1,0};
    int[] dcol={0,1,0,-1};
    int cnt=0;
    while (!queue.isEmpty()){
        int r=queue.peek().row;
        int c=queue.peek().col;
        int t=queue.peek().time;
        queue.remove();
        time=Math.max(time,t);
        for (int i = 0; i < 4; i++) {
            int nrow=r+drow[i];
            int ncol=c+dcol[i];
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n
                    &&vis[nrow][ncol]==0 && grid[nrow][ncol]==1){
                queue.add(new pair(nrow,ncol,t+1));
                vis[nrow][ncol]=2;
                cnt++;
            }
        }
    }
    if(cnt!=cntfresh)
        return -1;
    return time;

    }
}