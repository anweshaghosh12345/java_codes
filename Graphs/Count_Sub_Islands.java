package Graphs;

public class Count_Sub_Islands {
    int ans=0;
    public  void dfs(int[][] grid1,int[][] grid2,int r,int c){
        if(r<0 || r>=grid1.length|| c<0 || c>=grid1[0].length|| grid2[r][c]==0)
            return;
        grid2[r][c]=0;
        if(grid1[r][c]==0)
            ans=0;
        dfs(grid1,grid2,r+1,c);
        dfs(grid1,grid2,r-1,c);
        dfs(grid1,grid2,r,c-1);
        dfs(grid1,grid2,r,c+1);
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int c=0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if(grid2[i][j]==1){
                    ans=1;
                    dfs(grid1,grid2,i,j);
                    c+=ans;
                }
            }
        }
        return c;
    }
}
