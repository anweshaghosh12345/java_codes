package Tree;

public class Symmetric_Tree {
    public boolean isSymmetric(TreeNode root) {
        return  root==null|| Symmetry(root.left, root.right);
    }
    public boolean Symmetry(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(right.val!=left.val)
            return false;
        return (Symmetry(left.left,right.right)&& Symmetry(left.right,right.left));
    }
}
