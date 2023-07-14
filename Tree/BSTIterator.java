package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BSTIterator {
    private Stack<TreeNode> st=new Stack<>();

    int index=0;
    public BSTIterator(TreeNode root) {
        pushALL(root);
    }
    public int next() {
       TreeNode node=st.pop();
       pushALL(node.right);
       return node.val;
    }

    public boolean hasNext() {
        return  !st.isEmpty();
    }
    private  void pushALL(TreeNode node){
        for (;node !=null; st.push(node),node=node.left);

    }


}
