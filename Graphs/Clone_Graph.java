package Graphs;
import java.util.*;

class Node__ {
    public int val;
    public List<Node__> neighbors;
    public Node__() {
        val = 0;
        neighbors = new ArrayList<Node__>();
    }
    public Node__(int _val) {
        val = _val;
        neighbors = new ArrayList<Node__>();
    }
    public Node__(int _val, ArrayList<Node__> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}

public class Clone_Graph {
    public void dfs(Node__ node, Node__ copy, Node__[] vis){
       vis[copy.val]=copy;
       for(Node__ e: node.neighbors){
           if(vis[e.val]==null){
               Node__ newNode=new Node__(e.val);
               copy.neighbors.add(newNode);
               dfs(e,newNode,vis);
           }else{
               copy.neighbors.add(vis[e.val]);
           }
       }
    }
    public Node__ cloneGraph(Node__ node) {
        if(node==null)
            return null;
       Node__ copy=new Node__(node.val);
       Node__[] vis=new Node__[101];
       Arrays.fill(vis,null);
       dfs(node,copy,vis);

        return copy;
    }
}
