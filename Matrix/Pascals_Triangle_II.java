package Matrix;

import java.util.ArrayList;
import java.util.List;

public class Pascals_Triangle_II {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        res.get(0).add(1);

        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> row=new ArrayList<>();
            List<Integer> pre_row=res.get(i-1);

                row.add(1);

            for (int j = 1; j <i ; j++) {
                    row.add(pre_row.get(j-1)+pre_row.get(j));
            }
            row.add(1);
            res.add(row);
        }

        return res.get(rowIndex);

    }
}