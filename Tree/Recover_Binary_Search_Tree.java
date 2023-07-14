package Tree;

public class Recover_Binary_Search_Tree {
    private TreeNode first;
    private TreeNode prev;
    private TreeNode mid;
    private TreeNode last;
    private void inorder(TreeNode root){
        if(root==null)
            return;
        inorder(root.left);
        if(prev !=null && (root.val<prev.val)){
            if(first ==null){
                first=prev;
                mid=root;
            }else {
                last=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
    public void recoverTree(TreeNode root) {
        first=mid=last=null;
        prev=new TreeNode(Integer.MIN_VALUE);
        inorder(root);
        if(first!=null && last !=null){
            int t=first.val;
            first.val=last.val;
            last.val=t;
        }
        else if(first!=null && mid!=null){
            int t=first.val;
            first.val=mid.val;
            mid.val=t;
        }
    }
}