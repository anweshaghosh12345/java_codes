package Tree;

import java.util.ArrayList;
import java.util.List;

public class Postorder_Traversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        postorder(root,ans);
        return ans;
    }

    public void postorder(TreeNode root, List<Integer> ans){
        if(root!=null){
            postorder(root.left, ans);
            postorder(root.right,ans);
            ans.add(root.val);
        }
    }
}
