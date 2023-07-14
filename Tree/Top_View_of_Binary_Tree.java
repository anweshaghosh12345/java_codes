package Tree;

import java.util.*;
class Pair{
    Node5 node;
    int x;
    Pair(TreeNode _node, int x){
        node= (Node5) _node;
        this.x=x;
    }
}
class Node5 extends TreeNode {
    int data;
    Node5 left;
    Node5 right;
    Node5(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

public class Top_View_of_Binary_Tree {
    static ArrayList<Integer> topView(Node5 root)
    {
        // add your code
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Map<Integer,Integer> map=new TreeMap<>();
        Queue<Pair> q=new LinkedList<Pair>();

        q.add(new Pair(root,0));
        while (!q.isEmpty()){
            Pair curr=q.poll();

            if(!map.containsKey(curr.x))
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