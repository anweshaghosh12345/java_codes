package Tree;

public class Max_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        int ldpt,rdpt;
        if(root==null)
            return 0;
        ldpt=maxDepth(root.left);
        rdpt=maxDepth(root.right);
        return Math.max(ldpt,rdpt)+1;
    }
}
