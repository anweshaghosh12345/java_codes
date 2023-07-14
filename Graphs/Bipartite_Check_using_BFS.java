package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_Check_using_BFS {
    public boolean bfsCheck(ArrayList<ArrayList<Integer>> adj,
                            int node,int[] color){
        Queue<Integer> q=new LinkedList<>();
        q.add(node);
        color[node]=1;

        while (!q.isEmpty()){
            int nde=q.poll();
            for (int i:adj.get(nde)){
                if(color[i]==-1){
                    color[i]=1-color[nde];
                    q.add(i);
                }
                else if(color[i]==color[nde])
                    return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {

        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] color=new int[graph.length];
        Arrays.fill(color,-1);
        for (int i = 0; i < graph.length; i++) {
            ArrayList<Integer> ar=new ArrayList<>();
            for (int j = 0; j < graph[i].length; j++) {
                ar.add(graph[i][j]);
            }
            adj.add(ar);
        }
        for (int i = 0; i < color.length; i++) {
            if(color[i]==-1){
                if(!bfsCheck(adj,i,color))
                    return false;
            }
        }
        return  true;
    }
}
