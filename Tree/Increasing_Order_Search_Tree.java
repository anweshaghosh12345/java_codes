package Tree;

import java.util.ArrayList;
import java.util.List;

public class Increasing_Order_Search_Tree {
    public TreeNode increasingBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        TreeNode ans=new TreeNode(0),cur=ans;
        for (Integer n:arr) {
            cur.right=new TreeNode(n);
            cur=cur.right;
        }
        return ans.right;
    }
    public  void inorder(TreeNode root , List<Integer> arr){
        if(root==null)
            return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}
