package Tree;

import java.util.ArrayList;
import java.util.Stack;

class BST_Iterator{
    private Stack<TreeNode> st=new Stack<>();
//    if reverse= true means before
//    if reverse= true means after
    boolean reverse=true;
    public BST_Iterator(TreeNode root,boolean isreverse) {
        reverse=isreverse;
        pushALL(root);
    }
    public int next() {
        TreeNode node=st.pop();
        if(!reverse)
            pushALL(node.right);
        else pushALL(node.left);
        return node.val;
    }
    private  void pushALL(TreeNode node){
        while (node!=null){
            st.push(node);
            if(reverse)
                node=node.right;
            else
                node=node.left;
        }
    }

    public boolean hasNext() {
        return  !st.isEmpty();
    }

}
public class Two_Sum_BST {
    public boolean findTarget(TreeNode root, int k) {
         if(root==null)
             return false;
         BST_Iterator l=new BST_Iterator(root,false);
         BST_Iterator r=new BST_Iterator(root,true);
         int i=l.next();
         int j=r.next();
         while (i<j){
             if(i+j==k)
                 return true;
             else if(i+j<k)
                 i=l.next();
             else
                 j=r.next();
         }
         return false;
    }
}
/*
 ArrayList<Integer> ar=new ArrayList<>();
       Inorder(root,ar);
        int str=0;
        int end=ar.size()-1;
        while (str<end){
            if(ar.get(str)+ar.get(end)==k)
                return true;
            else if(ar.get(str)+ar.get(end)>k){
                end--;
            }else {
                str++;
            }
        }
        return false;
    }
    void Inorder(TreeNode root,ArrayList<Integer>ar){
        if(root!=null){
            Inorder(root.left,ar);
            ar.add(root.val);
            Inorder(root.right,ar);
        }
 */
