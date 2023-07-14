package Tree;

import java.util.HashMap;

public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length || inorder==null || postorder==null)
            return null;

        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i],i);
        }
        TreeNode root=TreeBuild(inorder,0,inorder.length-1,
                postorder,0,postorder.length-1,map);

        return root;
    }
    public TreeNode TreeBuild(int[] inorder, int in_Start, int in_end,
                              int[] postorder, int post_start, int post_end,
                              HashMap<Integer,Integer> map){
        if(in_Start>in_end || post_start>post_end)
            return null;

        TreeNode root=new TreeNode(postorder[post_end]);
        int inRoot=map.get(postorder[post_end]);
        int leftNum=inRoot-in_Start;
        root.left=TreeBuild(inorder,in_Start,inRoot-1,
                postorder,post_start,post_start+leftNum-1,map);
        root.right=TreeBuild(inorder,inRoot+1,in_end,postorder,
                post_start+leftNum,post_end-1,map);

        return root;
    }
}
