package Tree;

import java.util.ArrayList;
import java.util.List;

public class Preorder_Morris {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder=new ArrayList<>();
        TreeNode cur=root;
        while (cur!=null){
            if(cur.left==null){
                inorder.add(cur.val);
                cur=cur.right;
            }
            else {
                TreeNode prev=cur.left;
                while (prev.right!=null && prev.right!=cur ){
                    prev=prev.right;
                }
                if(prev.right==null){
                    prev.right=cur;
                    inorder.add(cur.val);
                    cur=cur.left;
                }else {
                    prev.right=null;
                    cur=cur.right;
                }
            }
        }
        return inorder;
    }
}
