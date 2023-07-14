package Tree;

import java.util.*;

public class Bottom_View_of_Binary_Tree {
    public ArrayList<Integer> bottomView(Node5 root)
    {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<Pair>();

        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair curr=q.poll();


            map.put(curr.x, curr.node.data);

            if(curr.node.left!=null){
                q.add(new Pair(curr.node.left,curr.x-1));
            }

            if(curr.node.right!=null){
                q.add(new Pair(curr.node.right, curr.x+1));
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
