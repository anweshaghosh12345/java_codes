package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Path_in_Undirected_GraphwithUnitWeights {
    private void shortestPath(ArrayList<ArrayList<Integer>> adj,int n,int src){
        int[] dist=new int[n];
        for (int i = 0; i < n; i++) {
            dist[i]=1000000000;
        }
        Queue<Integer> q=new LinkedList<>();
        dist[src]=0;
        q.add(src);
        while (!q.isEmpty()){
            int node=q.poll();

            for (int it: adj.get(node)){
                if(dist[node]+1 <dist[it]){
                    dist[it]=dist[node]+1;
                    q.add(it);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(dist[i]+" ");
        }
    }
}
