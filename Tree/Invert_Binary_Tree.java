package Tree;

//import javax.swing.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Invert_Binary_Tree {
    void swap(TreeNode root){
        if(root==null)
            return;
        swap(root.left);
        swap(root.right);
        TreeNode t=root.left;
        root.left=root.right;
        root.right=t;
    }
    public TreeNode invertTree(TreeNode root) {
        swap(root);
        return root;
    }
}