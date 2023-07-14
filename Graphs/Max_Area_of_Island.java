package Graphs;

public class Max_Area_of_Island {
    boolean[][] seen;
    int[][] grid;
    public int area(int r,int c){
        if(r<0 || r>=grid.length || c<0 || c>= grid[0].length|| seen[r][c]|| grid[r][c]==0)
            return 0;
        seen[r][c]=true;
        return (1+ area(r+1,c)+area(r-1,c)+area(r,c-1)+ area(r,c+1));
    }
    public int maxAreaOfIsland(int[][] grid) {
        this.grid=grid;
        seen=new boolean[grid.length][grid[0].length];
        int ans=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                ans=Math.max(ans,area(i,j));
            }
        }
        return ans;
    }
}
