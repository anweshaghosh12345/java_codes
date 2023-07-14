package Graphs;

import java.util.ArrayList;

public class DFS {
    public void dfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj,
                    ArrayList<Integer> ans){
        ans.add(node);
        vis[node]=true;
        for (Integer n:adj.get(node)) {
            if(!vis[n])
                dfs(n,vis,adj,ans);
        }
    }
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean[] vis=new boolean[V];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if(!vis[i]){
                vis[i]=true;
                dfs(i,vis,adj,ans);
            }
        }
        return ans;
    }
}
