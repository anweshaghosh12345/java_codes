package Tree;

public class Minimum_Depth_of_Binary_Tree {
    public int minDepth(TreeNode root) {
        return check(root);
    }
    int check(TreeNode root){
        if(root==null)
            return 0;
        int lh=check(root.left);
        int rh=check(root.right);
        if(lh==0)
            return rh+1;
         else if(rh==0)
            return lh+1;
        else if(lh!=0 && rh!=0)
        return Math.min(lh,rh)+1;
        else
            return 1;
    }
}
