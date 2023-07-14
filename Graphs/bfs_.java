package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs_ {
    public ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> ans=new ArrayList<>();
        boolean [] vis=new boolean[v+1];

        for(int i=0;i<=v;i++){
            if(vis[i]==false){
                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                vis[i]=true;
                while (!q.isEmpty()){
                    Integer node=q.poll();
                    ans.add(node);
                    for (Integer n:adj.get(node)){
                        if(vis[n]==false) {
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
