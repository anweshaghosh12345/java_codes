package Tree;

import java.util.ArrayList;

public class Kth_Smallest_Element_in_BST {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr=Inorder(root,arr);
        return arr.get(k-1);
    }
    public ArrayList<Integer> Inorder(TreeNode root, ArrayList<Integer> arr){
        if(root==null)
            return arr;
        Inorder(root.left,arr);
        arr.add(root.val);
        Inorder(root.right,arr);
        return arr;
    }
}
/*
static Node kthsmallest(Node root,int k[])
{
	if(root==null)
	return null;

	Node left=kthsmallest(root.left,k);
	if(left!=null)
	return left;
	k[0]--;
	if(k[0]==0)
	return root;

	return kthsmallest(root.right,k);
}
 */