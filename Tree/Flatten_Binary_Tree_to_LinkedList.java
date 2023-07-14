package Tree;

public class Flatten_Binary_Tree_to_LinkedList {
//    static  TreeNode prev=null;
    public void flatten(TreeNode root){
       TreeNode cur=root;
       while (cur!=null){
           if(cur.left!=null){
               TreeNode prev=cur.left;
               while (prev.right!=null)
                   prev=prev.right;
               prev.right=cur.right;
               cur.right=cur.left;
               cur.left=null;
           }
           cur=cur.right;
       }
    }

}

/*
TreeNode prev=null;
        if(root==null)
            return;

        flatten(root.right);
        flatten(root.left);
        root.right=prev;
        root.left=null;
        prev=root;

        *************************************
         Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            TreeNode cur=st.pop();
            if(cur.right!=null)
                st.push(cur.right);
            if(cur.left!=null)
                st.push(cur.left);

            if(!st.isEmpty()){
                cur.right=st.peek();
            }
            cur.left=null;
        }
 */
