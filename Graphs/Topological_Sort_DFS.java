package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sort_DFS {
    static void dfs(int node, boolean[] vis, Stack<Integer> s,
                    ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for (int i: adj.get(node) ){
            if(!vis[i]){
                dfs(i,vis,s,adj);
            }
        }
        s.push(node);
    }
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        boolean[] vis=new boolean[v];
        int[] ans=new int[v];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < v; i++) {
            if(!vis[i]){
               dfs(i,vis,s,adj);
            }
        }
        int i=0;
       while (!s.isEmpty()){
            ans[i++]=s.pop();

        }
        return ans;
    }

}
