package Graphs;

import java.util.ArrayList;
import java.util.Arrays;

public class Bipartite_Graph_DFS {
    public  static  boolean dfsCheck(int node,int[] color,ArrayList<ArrayList<Integer>> edg){
        color[node]=1;
        for (int i: edg.get(node)) {
            if(color[i]==-1)
            {
                color[i]=1-color[node];
                if(!dfsCheck(i,color,edg))
                    return false;
            }
            else if(color[i]==color[node]){
                return false;
            }
        }
        return true;
    }
    public static boolean isGraphBirpatite(ArrayList<ArrayList<Integer>> edges) {

        // Write your code here
        int[] color=new int[edges.size()];
        Arrays.fill(color,-1);
        for (int i = 0; i < color.length; i++) {
            if(color[i]==-1){
                if(!dfsCheck(i,color,edges))
                    return false;
            }
        }
        return true;
    }
}
