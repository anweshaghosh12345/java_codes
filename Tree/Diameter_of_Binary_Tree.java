package Tree;

public class Diameter_of_Binary_Tree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter=new int[1];
        findmax(root,diameter);
        return diameter[0];
    }
    int findmax(TreeNode root, int[] diameter){
        if(root==null)
            return 0 ;

        int l=findmax(root.left,diameter);
        int r=findmax(root.right,diameter);
        diameter[0]=Math.max(diameter[0],l+r);
        return 1+Math.max(l,r);
//        return max;
    }
}
