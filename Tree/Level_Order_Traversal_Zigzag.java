package Tree;
import java.util.*;
public class Level_Order_Traversal_Zigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int flag=0;
        while (!q.isEmpty()){
            int size= q.size();
            List<Integer> level=new ArrayList<Integer>(size);
            for (int i = 0; i < size; i++) {
                TreeNode temp=q.poll();
                level.add(temp.val);
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }
            if(flag==0) {
                ans.add(level);
                flag=1;
            }
            else {
                Collections.reverse(level);
                ans.add(level);
                flag=0;
            }
        }
        return ans;
    }
}
