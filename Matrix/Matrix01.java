package Matrix;

public class Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;

        int ans[][]=new int[row][col];
        for (int r = 0; r < row; r++) {
            for (int c = 0; c < col; c++) {
                if(mat[r][c]==0){
                    ans[r][c]=0;
                }else {
                    ans[r][c]=Integer.MAX_VALUE-1;
                }
            }
        }
        for (int i = row-1; i >=0;i--) {
            for (int j = col-1; j >=0 ; j--) {
                if(mat[i][j] !=0){
                    if(i-1>=0){
                        ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
                    }
                    if(j-1>=0){
                        ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
                    }
                    if(i+1<row){
                        ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
                    }if(j+1<col){
                        ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] !=0){
                    if(i-1>=0){
                        ans[i][j]=Math.min(ans[i][j],ans[i-1][j]+1);
                    }
                    if(j-1>=0){
                        ans[i][j]=Math.min(ans[i][j],ans[i][j-1]+1);
                    }
                    if(i+1<row){
                        ans[i][j]=Math.min(ans[i][j],ans[i+1][j]+1);
                    }if(j+1<col){
                        ans[i][j]=Math.min(ans[i][j],ans[i][j+1]+1);
                    }
                }
            }
        }

        return ans;
    }

}
