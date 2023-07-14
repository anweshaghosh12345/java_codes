package Tree;

import java.util.ArrayList;
import java.util.List;

public class Preorder_Traversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        help(root,ans);
        return ans;
    }
    public void help(TreeNode root, List<Integer> ans){
        if(root != null){
           ans.add(root.val);
           help(root.left,ans);
           help(root.right,ans);
        }
    }
}
