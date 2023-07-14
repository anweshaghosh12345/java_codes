package Tree;
import java.util.*;

public class Boundary_Traversal_of_Binary_Tree {
    public  static boolean isLeaf(TreeNode root){
        return (root.left==null)&&(root.right==null);
    }
    public static void addLeftBoundary(TreeNode root, ArrayList<Integer>res){
        TreeNode cur=root.left;
        while (cur!=null){
            if(!isLeaf(cur))
                res.add(cur.val);
            if(cur.left!=null)
                cur=cur.left;
            else
                cur=cur.right;
        }
    }
    public static void addRightBoundary(TreeNode root, ArrayList<Integer> res){
        ArrayList<Integer> temp=new ArrayList<>();
        TreeNode cur=root.right;
        if(!isLeaf(cur))
            temp.add(cur.val);
        while(cur!=null) {
            if (cur.right != null)
                cur = cur.right;
            else
                cur = cur.right;
        }
        int i;
        for ( i = temp.size(); i >=0 ; i--) {
            res.add(temp.get(i));
        }
    }
    public static void addLeaves(TreeNode root, ArrayList<Integer> res){
        if(isLeaf(root)) {
            res.add(root.val);
            return;
        }
        if(root.left!=null)
            addLeaves(root.left,res);
        if(root.right!=null)
            addLeaves(root.right,res);
    }
    public static  ArrayList<Integer> traverseBoundary(TreeNode root){
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;

        if(!isLeaf(root))
            ans.add(root.val);
        addLeftBoundary(root,ans);
        addLeaves(root,ans);
        addRightBoundary(root,ans);
        return ans;
    }
}
