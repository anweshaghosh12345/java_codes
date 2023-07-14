package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort_BFS_Kahns_Algorithm {
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj) {
        int topo[]=new int[v];
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
            topo[ind++]=node;
            for (Integer it: adj.get(node)){
                indigree[it]--;
                if(indigree[it]==0)
                    q.add(it);
            }
        }
        return topo;
    }
}
