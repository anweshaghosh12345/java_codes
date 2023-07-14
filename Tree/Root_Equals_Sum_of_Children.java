package Tree;

public class Root_Equals_Sum_of_Children {
    public boolean checkTree(TreeNode root) {
        if(root== null)
            return true;
        if(root.val==root.left.val+root.right.val)
            return true;
        else
            return false;
    }
}