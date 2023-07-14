package Matrix;

import java.util.HashSet;

public class Valid_Sudoku {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] box=new HashSet[9];

        for (int i = 0; i < 9; i++) {
            row[i]=new HashSet<Character>();
            col[i]=new HashSet<Character>();
            box[i]=new HashSet<Character>();
        }

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char val=board[r][c];

                if(val=='.') {
                    continue;
                }
                if(row[r].contains(val)) {
                    return false;
                }
                else {
                    row[r].add(val);
                }
                if(col[c].contains(val)){
                    return false;
                }else {
                    col[c].add(val);
                }

                int b=(r/3)*3+c/3;
                if(box[b].contains(val)){
                    return false;
                }
                else {
                    box[b].add(val);
                }
            }
        }
        return true;
        
    }
}
