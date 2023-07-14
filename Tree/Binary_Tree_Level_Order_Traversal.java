package Tree;

import java.util.*;

public class Binary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        if(root==null)
            return ans;
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int size=q.size();
            while(size-->0) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                level.add(q.poll().val);
            }
            ans.add(level);
        }

        return ans;
    }
}
