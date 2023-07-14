package Tree;

import java.util.HashMap;
import java.util.Map;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

       HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }
        TreeNode root=BuildTree(preorder,0,
                preorder.length-1,inorder,0,inorder.length-1,map);
        return root;
    }
    static TreeNode BuildTree(int[] preoder, int prestart, int preEnd,
                              int[]inorder, int inStart, int inEnd, Map<Integer,Integer> inmap){
        if(prestart>preEnd || inEnd<inStart)
            return null ;
        TreeNode root=new TreeNode(preoder[prestart]);
        int inroot=inmap.get(root.val);
        int numleft=inroot-inStart;

        root.left=BuildTree(preoder,prestart+1,prestart+numleft,inorder,
                inStart,inEnd-1,inmap);
        root.right=BuildTree(preoder,prestart+numleft+1,preEnd,
                inorder,inroot+1,inEnd,inmap);
        return root;
    }
}
