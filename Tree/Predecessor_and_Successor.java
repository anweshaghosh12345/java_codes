package Tree;


public class Predecessor_and_Successor {
    public static TreeNode findSuc(TreeNode root, TreeNode p)
    {
        // add your code here
        TreeNode successor=null;
        while (root!=null){
           if(p.val>= root.val)
               root=root.right;
           else {
               successor=root;
               root=root.left;
           }
        }
        return successor;
    }
    public static TreeNode findPre(TreeNode root, TreeNode p) {
        TreeNode pre=null;
        while (root!=null){
            if(p.val<=root.val){
                root=root.left;
            }
            else {
                pre=root;
                root=root.right;
            }
        }
        return pre;

    }

}
