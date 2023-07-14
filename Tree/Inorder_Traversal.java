package Tree;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class Inorder_Traversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer>res=new ArrayList<>();
        tree(root,res);
        return res;
    }
    public void tree(TreeNode root, List<Integer> rs){
        if(root!=null) {
            tree(root.left, rs);
            rs.add(root.val);
            tree(root.right, rs);
        }
    }
}