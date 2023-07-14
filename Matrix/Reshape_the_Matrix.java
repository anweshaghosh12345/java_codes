package Matrix;

public class Reshape_the_Matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

       if(mat.length*mat[0].length != r*c)
           return mat;

       int[][] reshape=new int[r][c];
       int row=0,col=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(row<r && col<c)
                    reshape[row][col++]= mat[i][j];



                if(row<r && col==c){
                    row++;
                    col=0;
                }
            }
        }
        return reshape;
    }
}
