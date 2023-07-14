package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.WeakHashMap;

public class BFS {
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] vis=new boolean[V+1];

        for (int i = 1; i < V; i++) {
            if(vis[i]){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                vis[i]=true;
                while (!q.isEmpty()){
                    Integer node =q.poll();
                    ans.add(node);
                    for (Integer n: adj.get(node)){
                        if(vis[n]){
                            vis[n]=true;
                            q.add(n);
                        }
                    }
                }
            }
        }
        return ans;
    }

}
