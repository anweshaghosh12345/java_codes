package Tree;

public class Second_Minimum_Node_in_BT {
    int min1;
    long ans=Long.MAX_VALUE;
    public void inorder(TreeNode root){
        if(root!=null) {
            if(min1< root.val && root.val<ans)
                ans=root.val;
            inorder(root.left);
            inorder(root.right);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        min1=root.val;
        inorder(root);

        return ans<Long.MAX_VALUE? (int) ans:-1;
    }
}
