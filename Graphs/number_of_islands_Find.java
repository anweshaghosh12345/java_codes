package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class pair_{
    int row,col;
    pair_(int row,int col){
        this.row=row;
        this.col=col;
    }
}
public class number_of_islands_Find {
    public void bfs(int row, int col,boolean[][] vis,char[][]grid){
        vis[row][col]=true;
        Queue<pair_> q=new LinkedList<>();
        q.add(new pair_(row,col));
        int n=grid.length;
        int m=grid[0].length;

        while (!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            q.poll();
            for (int  delrow = -1; delrow <=1 ; delrow++) {
                for (int delcol = -1; delcol <=1 ; delcol++) {
                    int newrow=r+delrow;
                    int newcol=c+delcol;
                    if(newrow>=0 && newrow<n && newcol>=0 && newcol<m&&
                    grid[newrow][newcol]=='1' && !vis[newrow][newcol]){
                        vis[newrow][newcol]=true;
                        q.add(new pair_(newrow,newcol));
                    }
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        // Code here
        int count=0;
         boolean[][] vis=new boolean[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
              if(!vis[i][j] && grid[i][j]=='1'){
                  vis[i][j]=true;
//                  q.add(new pair_(i,j));
                  count++;
                  bfs(i,j,vis,grid);

              }
            }
        }
        return count;
    }
}
