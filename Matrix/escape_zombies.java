package Matrix;

import java.util.Scanner;

public class escape_zombies {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] island=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                island[i][j]=in.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(island[i][j]==0){
                    island[i][j]=island[i][j]+ minSum(island,i,j);
                }
            }
        }
        System.out.println(island[0][0]);
    }
    public static int minSum(int[][] grid,int m,int n){
        if(m==grid.length-1 && n==grid[0].length-1)
            return 0;
        if(m==grid.length-1)
            return grid[m][n+1];
        if(n==grid[0].length-1)
            return grid[m+1][n];
        return Math.min(grid[m][n+1],grid[m+1][n]);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        dfs(image,sr,sc,image[sr][sc],newColor);
        return image;
    }
    public  void dfs(int[][] image, int sr, int sc,int color, int newColor){
        if( sr<0 || sc<0 || sr >= image.length||
                sc>=image[0].length||image[sr][sc] != color ){
            return;
        }
        image[sr][sc]=newColor;
        dfs(image, sr-1,sc,color,newColor);
        dfs(image, sr+1,sc,color,newColor);
        dfs(image, sr,sc-1,color,newColor);
        dfs(image, sr,sc+1,color,newColor);
    }
}
