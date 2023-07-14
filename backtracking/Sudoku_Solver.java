package backtracking;
import java.util.*;

public class Sudoku_Solver {
    static boolean isValidSudoku(char[][] board, int row,int col,char val) {

        for (int i = 0; i < 9; i++) {

                if(board[i][col]==val) {
                    return false;
                }
               if(board[row][i]==val)
                   return false;

                if(board[3*(row/3)+i/3][3*(col/3)+i%3]==val)
                    return false;
        }
        return true;
    }
    static boolean solve(char[][] board){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(board[i][j]=='.'){
                    for (char c= '1'; c <='9'; c++) {
                        if(isValidSudoku(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board))
                                return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}
