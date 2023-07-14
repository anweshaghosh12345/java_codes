package Tree;

import java.util.Deque;
import java.util.LinkedList;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Deque<TreeNode> deque=new LinkedList<TreeNode>();
        deque.add(p);
        deque.add(q);
        while (!deque.isEmpty()){
            p=deque.poll();
            q=deque.poll();
            if(p==null && q==null)
                continue;
            if(p==null || q==null)
                return false;
            if(p.val != q.val)
                return false;
            deque.add(p.left);
            deque.add(q.left);
            deque.add(p.right);
            deque.add(q.right);
        }
        return true;
    }
}
