package Graphs;

import java.util.ArrayList;

public class Cycle_Detection_in_Undirected_Graph_using_DFS {
    public boolean canFinish(int n, int[][] prerequisites) {

        boolean vis[]=new boolean[n];
        boolean visparent[]=new boolean[n];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
           adj.get(edge[0]).add(edge[1]);
        }
        for (int i = 0; i < n; i++) {
            if(vis[i]==false) {

                if (cycle_dfs(i, vis, visparent,adj))
                    return false;
            }
        }
        return true;
    }
    public boolean cycle_dfs(int node,boolean vis[],boolean visparent[],ArrayList<ArrayList<Integer>> prerequisite){
        vis[node]=true;
        visparent[node]=true;
        for (Integer n: prerequisite.get(node)) {
            if(vis[n]==false) {
                if (cycle_dfs(n,  vis,visparent, prerequisite))
                    return true;
            }
                else if(visparent[n])
                    return true;


        }
        visparent[node]=false;
        return false;
    }
}
