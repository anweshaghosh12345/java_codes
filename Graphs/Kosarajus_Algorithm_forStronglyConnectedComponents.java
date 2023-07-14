package Graphs;
import  java.util.*;
public class Kosarajus_Algorithm_forStronglyConnectedComponents {

    void dfs(int node, boolean[] vis, Stack<Integer> s,ArrayList<ArrayList<Integer>> adj){
        vis[node]=true;
        for(int n: adj.get(node)){
            if(!vis[n]) {
                dfs(n, vis, s, adj);
            }
        }
        s.push(node);
    }
    private void revDfs(int node,ArrayList<ArrayList<Integer>>transpose,boolean[]vis){
        vis[node]=true;
        System.out.println(node+" ");
        for (Integer it: transpose.get(node)){
            if(!vis[it]){
                revDfs(it,transpose,vis);
            }
        }
    }
    void kosaRaju(ArrayList<ArrayList<Integer>> adj, int n){
        boolean vis[]=new boolean[n];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                dfs(i,vis,s,adj);
            }
        }
        ArrayList<ArrayList<Integer>> transpose=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            transpose.add(new ArrayList<Integer>());
        }
        for (int i = 0; i < n; i++) {
            vis[i]=false;
            for (int i1:adj.get(i)){
                transpose.get(i1).add(i);
            }
        }
        while (s.size()>0){
            int node=s.pop();
            if(!vis[node]){
                System.out.println("SCC: ");
                revDfs(n,transpose,vis);
                System.out.println();
            }
        }
    }
    public static void main(String args[])
    {
        int n = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Integer>());
        }

        adj.get(1).add(3);
        adj.get(2).add(1);
        adj.get(3).add(2);
        adj.get(3).add(5);
        adj.get(4).add(6);
        adj.get(5).add(4);
        adj.get(6).add(5);


        Kosarajus_Algorithm_forStronglyConnectedComponents obj = new Kosarajus_Algorithm_forStronglyConnectedComponents();
        obj.kosaRaju(adj, n);

    }
}
