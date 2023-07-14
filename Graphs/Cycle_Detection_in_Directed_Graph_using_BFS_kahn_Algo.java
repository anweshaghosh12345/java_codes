package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cycle_Detection_in_Directed_Graph_using_BFS_kahn_Algo {
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {

        int[] indigree=new int[v];
        for (int i = 0; i < v; i++) {
            for(int j:adj.get(i))
                indigree[i]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for (int i = 0; i < v; i++) {
            if(indigree[i]==0)
                q.add(i);
        }
        int ind=0;
        while (!q.isEmpty()){
            Integer node=q.poll();
           ind++;
            for (Integer it: adj.get(node)){
                indigree[it]--;
                if(indigree[it]==0)
                    q.add(it);
            }
        }
       if(ind==v)
           return false;
       else
           return true;
    }
}
