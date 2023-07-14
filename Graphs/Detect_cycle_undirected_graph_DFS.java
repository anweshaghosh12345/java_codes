package Graphs;

import java.util.ArrayList;

public class Detect_cycle_undirected_graph_DFS{
    public boolean dfs(int node,int prev,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int i:adj.get(node)){
            if(vis[i]){
                if(prev!=i)
                    return true;
            }else{
                if(dfs(i,node,vis,adj))
                    return true;

            }
        }
        return false;
    }
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis=new boolean[v+1];
        for (int i = 1; i <= v; i++) {
            if(!vis[i]){
                if(dfs(i,-1,vis,adj))
                    return true;
            }
        }
        return false;
    }
}
