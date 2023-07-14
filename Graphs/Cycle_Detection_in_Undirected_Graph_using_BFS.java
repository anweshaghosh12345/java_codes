package Graphs;

import java.io.IOException;
import java.util.*;

public class Cycle_Detection_in_Undirected_Graph_using_BFS {

    public static void main(String[] args) throws IOException
    {

        int V = 5;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0; i < V; i++)
            adj.add(i, new ArrayList<Integer>());
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(2).add(3);
        adj.get(1).add(3);
        adj.get(2).add(4);

        Solution obj = new Solution();
        boolean ans = obj.isCycle(V, adj);
        if(ans)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

}
class pair{
    int node;
    int parent;
    pair(int node,int parent){
        this.node=node;
        this.parent=parent;
    }
}

class Solution{
    public  boolean checkBFSCycle(int i,boolean[] vis, ArrayList<ArrayList<Integer>>adj){
        Queue<pair> queue=new LinkedList<>();
        queue.add(new pair(i,-1));
        vis[i]=true;
        while (!queue.isEmpty()){
            int  node=queue.peek().node;
            int prev=queue.peek().parent;
            queue.remove();
            for (Integer n: adj.get(node)){
                if(!vis[n]){
                    queue.add(new pair(n,node));
                    vis[n]=true;
                }
                else if(prev!=n){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[V];
        Arrays.fill(vis,false);
        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                if(checkBFSCycle(i,vis,adj))
                    return true;
            }
        }
        return false;
    }

}
