package Tree;

public class Path_Sum {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,targetSum,0);
    }
    public boolean check(TreeNode root, int target, int sum){

        if(root==null)
            return false;
        sum+=root.val;
        if(sum==target && root.left==null && root.right==null)
            return true;
        if(check(root.left,target,sum)|| check(root.right,target,sum))
            return true;

        return false;
    }
}
