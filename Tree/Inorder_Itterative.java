package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Inorder_Itterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        TreeNode cur=root;
        while (true){
            if(cur==null){
                if(stack.isEmpty())
                    break;

                    res.add(cur.val);
                    stack.pop();
                    cur=cur.right;

            }else {
                stack.push(cur);
                cur=cur.left;
            }
        }
        return res;
    }
}
