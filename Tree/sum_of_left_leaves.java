package Tree;

public class sum_of_left_leaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int[] sum=new int[1];
        hlp(root,sum,false);
        return sum[0];
    }
    public  void hlp(TreeNode root, int[] sum, boolean isLeft){
        if(root==null)
            return;
        if(root.right == null && root.left==null && isLeft){
            sum[0]+=root.val;
        }
        hlp(root.left,sum,true);
        hlp(root.right,sum,false);
    }
}
