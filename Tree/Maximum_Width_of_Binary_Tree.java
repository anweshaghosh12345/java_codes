package Tree;

import java.util.LinkedList;
import java.util.Queue;

class Pair_{
    TreeNode node;
    int num;
    Pair_(TreeNode _node, int _num){
        num=_num;
        node=_node;
    }
}

public class Maximum_Width_of_Binary_Tree {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        int ans=0;
        Queue<Pair_>q=new LinkedList<>();
        q.offer(new Pair_(root,0));
        while (!q.isEmpty()){
            int size=q.size();
            int min=q.peek().num;
            int first=0, last=0;
            for(int i=0;i<size;i++){
                int cur_id=q.peek().num-min;
                TreeNode node=q.peek().node;
                q.poll();
                if(i==0)
                    first=cur_id;
                if(i==size-1)
                    last=cur_id;
                if(node.left!=null)
                    q.offer(new Pair_(node.left,cur_id*2+1));
                if(node.right!=null)
                    q.offer(new Pair_(node.right,cur_id*2+2));
            }
            ans=Math.max(ans,last-first+1);
        }
        return ans;
    }
}
