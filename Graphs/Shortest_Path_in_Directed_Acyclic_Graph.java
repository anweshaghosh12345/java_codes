package Graphs;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
    private  int v;
    private int weight;
    Pair(int _v,int _w){
        v=_v;
        weight=_w;
    }
    int getV(){
        return v;
    }
    int getWeight(){
        return weight;
    }
}
public class Shortest_Path_in_Directed_Acyclic_Graph {

    void topoShort(int node,ArrayList<ArrayList<Pair>> adj,boolean[] vis,Stack s){
        vis[node]=true;
        for (Pair i: adj.get(node)){
           if(!vis[i.getV()]){
               topoShort(i.getV(),adj,vis,s);
           }
        }
        s.add(node);
    }

    void shortestPath(ArrayList<ArrayList<Pair>> adj, int n, int src){
        Stack s=new Stack();
        boolean[] vis=new boolean[n];
        int[] dist=new int[n];
        for (int i=0;i<n;i++){
            if(!vis[i]){
              topoShort(i,adj,vis,s);
            }
        }
        for (int i = 0; i < n; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        while (s.isEmpty()==false){
            int node=(int)s.pop();
            if(dist[node]!= Integer.MAX_VALUE){
                for (Pair it: adj.get(node)){
                    if(dist[node]+it.getWeight()<dist[it.getV()]){
                        dist[it.getV()]=dist[node]+it.getWeight();
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(dist[i]);
        }
    }
    public static void main(String[] args){
        int n=6;
        ArrayList<ArrayList<Pair>> adj=new ArrayList<ArrayList<Pair>>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<Pair>());
        }
        adj.get(0).add(new Pair(1,2));
        adj.get(0).add(new Pair(4,1));
        adj.get(1).add(new Pair(2,3));
        adj.get(2).add(new Pair(3,6));
        adj.get(4).add(new Pair(2,2));
        adj.get(4).add(new Pair(5,4));
        adj.get(5).add(new Pair(3,1));

        Shortest_Path_in_Directed_Acyclic_Graph obj=new Shortest_Path_in_Directed_Acyclic_Graph();
        obj.shortestPath(adj,n,0);


    }
}
