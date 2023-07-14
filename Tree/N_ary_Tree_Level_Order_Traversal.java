package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_ary_Tree_Level_Order_Traversal {
    public List<List<Integer>> levelOrder(node root) {



        List<List<Integer>> ans =new ArrayList<>();
        Queue<node> q=new LinkedList<>();
        if(root==null)
            return ans;
        q.add(root);
        while (! q.isEmpty()){
           int size =q.size();
           List<Integer> level =new ArrayList<>();
           while (size-->0){
               node head=q.poll();
               level.add(head.val);
               for (int i = 0; i < head.children.size(); i++) {
                   q.offer(head.children.get(i));
               }
           }
           ans.add(level);

        }

        return ans;
    }

}
