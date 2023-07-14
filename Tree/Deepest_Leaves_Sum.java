package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Deepest_Leaves_Sum {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int levelSum=0;
        while (!queue.isEmpty()){
            levelSum=0;
            for (int i = 0; i < queue.size(); i++) {
                TreeNode cur_node=queue.poll();
                levelSum+=cur_node.val;
                if(cur_node.left !=null){
                    queue.offer(cur_node.left);
                }
                if(cur_node.right !=null){
                    queue.offer(cur_node.right);
                }
            }
        }
        return levelSum;
    }
}
