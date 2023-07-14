package Tree;

public class Maximum_Path_Sum {
    public int maxPathSum(TreeNode root) {
        if(root==null)
            return 0;
        int[] max=new int[1];
        max[0]=Integer.MIN_VALUE;
        MaxPath(root,max);
        return max[0];
    }
    public  int MaxPath(TreeNode root, int[]max){
        if(root==null)
            return 0;
        int left=Math.max(0,MaxPath(root.left,max));
        int rigt=Math.max(0,MaxPath(root.right,max));
        max[0]=Math.max(max[0],left+rigt+root.val);
        return (root.val)+Math.max(left,rigt);
    }
}
