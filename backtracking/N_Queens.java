package backtracking;

import java.util.*;

public class N_Queens {
    static List<String>construct(char[][]board){
        List<String> res=new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
            String s=new String(board[i]);
            res.add(s);
        }
        return res;
    }

    void funct(int col, char[][] board, List < List < String >> res, int leftRow[], int lowerDiagonal[], int upperDiagonal[]){
        if(col==board.length){
            res.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (leftRow[row] == 0 && lowerDiagonal[row + col] == 0 && upperDiagonal[board.length - 1 + col - row] == 0) {
                board[row][col] = 'Q';
                leftRow[row] = 1;
                lowerDiagonal[row + col] = 1;
                upperDiagonal[board.length - 1 + col - row] = 1;
                funct(col + 1, board, res, leftRow, lowerDiagonal, upperDiagonal);
                board[row][col] = '.';
                leftRow[row] = 0;
                lowerDiagonal[row + col] = 0;
                upperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
       List<List<String>> res=new ArrayList<List<String>>();
        char[][] board=new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j]='.';
            }
        }
        int leftRow[] = new int[n];
        int upperDiagonal[] = new int[2 * n - 1];
        int lowerDiagonal[] = new int[2 * n - 1];
        funct(0, board, res, leftRow, lowerDiagonal, upperDiagonal);

       return res;
    }
}

/*
boolean validate(char[][]board,int r,int c){
        int dup_r=r;
        int dup_c=c;
//        for upper left diagonal
        while (r>=0&& c>=0){
            if(board[r][c]=='Q')
                return false;
            r--;c--;
        }
        r=dup_r;
        c=dup_c;
//        for left col
        while (c>=0){
            if(board[r][c]=='Q')return false;
            c--;
        }
        r=dup_r;
        c=dup_c;
//        for lower left diagonal
        while (c>=0 && r<board.length){
            if(board[r][c]=='Q')return false;
            c--;
            r++;
        }return true;
    }
 */