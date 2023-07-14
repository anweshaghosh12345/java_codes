package Tree;
import java.util.*;
public class Average_of_Levels_in_BinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        if(root==null)
            return ans;
        while (!q.isEmpty()){
            ArrayList<Double> level=new ArrayList<>();
            int size=q.size();
            while (size-->0){
                if(q.peek().left!=null)
                {
                    q.offer(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.offer(q.peek().right);
                }
                level.add((double) q.poll().val);
            }
            double sum=0.0000;
            int s=level.size();
           for(double n:level){
               sum+=n;
           }
            ans.add(sum/s);

        }
        return ans;
    }
}
