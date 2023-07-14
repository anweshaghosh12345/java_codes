package Graphs;

public class Number_of_Enclaves {
    public  void dfs(int[][] grid,int r,int c){
        if(r<0 || r>=grid.length|| c<0 || c>=grid[0].length|| grid[r][c]==0)
            return;
        grid[r][c]=0;
        dfs(grid,r+1,c);
        dfs(grid,r-1,c);
        dfs(grid,r,c-1);
        dfs(grid,r,c+1);
    }
    public int numEnclaves(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if((grid[i][j]==1)&& (i==0|| j==0|| i==grid.length-1|| j==grid[0].length-1))
                    dfs(grid,i,j);
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==1)
                    count++;
            }
        }
        return count;
    }
}
