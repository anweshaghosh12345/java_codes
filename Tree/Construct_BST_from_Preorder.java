package Tree;

public class Construct_BST_from_Preorder {
    public TreeNode bstFromPreorder(int[] preorder) {
        return create(preorder,Integer.MAX_VALUE,new int[]{0});
    }
    public TreeNode create(int[] preorder, int max, int[]i){
        if(i[0]==preorder.length || preorder[i[0]]>max)
            return null;
        TreeNode node=new TreeNode(preorder[i[0]++]);

        node.left=create(preorder,node.val,i);
        node.right=create(preorder,max,i);
        return node;
    }
}
