package Tree;

public class Ceil_in_BST {
    int findCeil(TreeNode root, int key) {
        if (root == null) return -1;
        // Code here
        TreeNode successor=null;
        while (root!=null){
            if(root.val==key)
                return key;
            if(key> root.val)
                root=root.right;
            else {
                successor=root;
                root=root.left;
            }
        }
        return successor.val;
    }
}
