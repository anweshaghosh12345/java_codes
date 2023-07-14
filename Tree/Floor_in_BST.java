package Tree;



public class Floor_in_BST {
    public static TreeNode pre=null;
    public static int floorInBST(TreeNode root, int x) {
        //    Write your code here.
//         TreeNode<Integer> pre=null;
        if (root == null)
            return pre.val;
        if(x==root.val)
            return x;
        if(x<root.val){
            return floorInBST(root.left,x);
        }
        else{
            pre=root;
            return floorInBST(root.right,x);
        }

//         return pre;
    }
}
