package Graphs;

import java.util.ArrayList;

public class Cycle_Detection_in_Directed_Graph_using_DFS {
    public  boolean checkCycle(int node,ArrayList<ArrayList<Integer>> adj,
                               boolean[] vis,boolean[] dfs_vis){
        vis[node]=true;
        dfs_vis[node]=true;
        for (Integer i:adj.get(node)){
            if(!vis[i]){
                if(checkCycle(i,adj,vis,dfs_vis))
                    return true;
            }
            else if(dfs_vis[i])
                return true;
        }
        dfs_vis[node]=false;
        return false;
    }
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis=new boolean[v];
        boolean[] dfs_vis=new boolean[v];
        for (int i = 0; i < v; i++) {
            if(!vis[i]) {
                if (checkCycle(i, adj, vis, dfs_vis))
                    return true;
            }
        }
        return  false;
    }
}
