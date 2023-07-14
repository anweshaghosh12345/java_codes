package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

class Node___ {
    private int v;
    private int weight;
    Node___(int v, int w){
        this.v=v;
        this.weight=w;
    }
    Node___(){
    }
    int getV(){
        return v;
    }
    int getWeight(){
        return weight;
    }
}

public class Minimum_Spanning_Tree {
    void primsAlgo(ArrayList<ArrayList<Node___>> adj, int v)
    {
        // Add your code here
        int[] key=new int[v+1];
        boolean[] mst=new boolean[v+1];
        int[] parent=new int[v+1];
        PriorityQueue<Node___> pq=new PriorityQueue<>();
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        Arrays.fill(parent,-1);
        int sum=0;
        for(int i=0;i<v-1;i++){
            int mini=1000000, u=0;
            for(int e=0;e<v;e++){
                if(!mst[e] && key[e]<mini){
                    mini=key[e];
                    u=e;
                }
            }
            mst[u]=true;
            int l=0;
            for (Node___ it: adj.get(u)){
                if(mst[it.getV()]==false && it.getWeight() <key[it.getV()] ){
                    parent[it.getV()]=u;
                    key[it.getV()]=it.getWeight();
                }
            }
        }
        for (int i=1;i<v;i++){
            System.out.println(parent[i]+" - "+i);
        }

    }
    public static void main(String args[])
    {
        int n = 5;
        ArrayList<ArrayList<Node___> > adj = new ArrayList<ArrayList<Node___> >();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Node___>());

        adj.get(0).add(new Node___(1, 2));
        adj.get(1).add(new Node___(0, 2));

        adj.get(1).add(new Node___(2, 3));
        adj.get(2).add(new Node___(1, 3));

        adj.get(0).add(new Node___(3, 6));
        adj.get(3).add(new Node___(0, 6));

        adj.get(1).add(new Node___(3, 8));
        adj.get(3).add(new Node___(1, 8));

        adj.get(1).add(new Node___(4, 5));
        adj.get(4).add(new Node___(1, 5));

        adj.get(2).add(new Node___(4, 7));
        adj.get(4).add(new Node___(2, 7));

        Minimum_Spanning_Tree obj = new Minimum_Spanning_Tree();
        obj.primsAlgo(adj, n);

    }

}
