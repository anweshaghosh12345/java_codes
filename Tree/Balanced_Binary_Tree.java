package Tree;

public class Balanced_Binary_Tree {
    public boolean isBalanced(TreeNode root) {
        if(check(root)!=-1)
            return true;
        else return false;
    }
    public int check(TreeNode root){
        if(root==null)
            return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        if(lh==-1 || rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        return Math.max(lh,rh)+1;
    }
}
