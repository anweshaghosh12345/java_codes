package Tree;
import java.util.*;
class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;

    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
class pair{
    BinaryTreeNode node;
    int x;
    pair(BinaryTreeNode _node, int x){
        node=_node;
        this.x=x;
    }
}

public class Preorder_Inorder_Postorder_in_1_Traversal {
    public static List<List<Integer>> getTreeTraversal(BinaryTreeNode<Integer> root) {
        // Write your code here.
        Stack<pair> st=new Stack<pair>();
        st.push(new pair(root,1));
        List<Integer>pre=new ArrayList<>();
        List<Integer>in=new ArrayList<>();
        List<Integer>post=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        while (!st.isEmpty()){
            pair cur=st.pop();
            if(cur.x==1){
                pre.add((Integer) cur.node.data);
                cur.x++;
                st.push(cur);
                if(cur.node.left!=null)
                st.push(new pair(cur.node.left,1));

            }
            else if(cur.x==2){
                in.add((Integer) cur.node.data);
                cur.x++;
                st.push(cur);
                if(cur.node.right!=null){
                    st.push(new pair(cur.node.right,1));
                }
            }
            else {
                post.add((Integer) cur.node.data);
            }
        }
        ans.add(pre);
        ans.add(in);
        ans.add(post);
        return ans;
    }
}
