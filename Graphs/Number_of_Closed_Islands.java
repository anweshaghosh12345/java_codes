package Graphs;

public class Number_of_Closed_Islands {
    public boolean dfs(int[][] grid,int row,int col){
        if(row<0|| row>=grid.length || col<0||
                col>=grid[0].length ){
            return false;
        }
        if(grid[row][col]==1)
            return true;
        grid[row][col]=1;
        boolean up =dfs(grid, row-1,col);
        boolean down=dfs(grid, row+1,col);
        boolean left=dfs(grid, row,col-1);
        boolean right=dfs(grid, row,col+1);

        return up && down && left && right;
    }
    public int closedIsland(int[][] grid) {
        int count=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]==0) {
                    if(dfs(grid, i, j) ){
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
