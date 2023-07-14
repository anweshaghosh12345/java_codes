package Tree;

import java.util.ArrayList;

public class Path_to_Given_Node {
    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer>arrayList=new ArrayList<>();
        if(A==null)
            return arrayList;
        check(A,B,arrayList);
            return arrayList;
    }
    public boolean check(TreeNode A, int B, ArrayList<Integer>ar){
       if(A==null)
           return false;
        ar.add(A.val);
        if(A.val==B)
            return true;
        if(check(A.left,B,ar)|| check(A.right,B,ar))
            return true;
        ar.remove(ar.size()-1);
        return false;
    }
}
