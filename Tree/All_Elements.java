package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class All_Elements {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans=new ArrayList<>();
        //List<Integer> ans1=new ArrayList<>();
        tree(root1,ans);
        tree(root2,ans);
        //ans.addAll(ans1);
        Collections.sort(ans);
        return  ans;
    }
    public void tree(TreeNode root, List<Integer> res){
        if (root != null){
            tree(root.left,res);
            res.add(root.val);
            tree(root.right,res);
        }
    }
}
