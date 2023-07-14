package Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class  Nodee implements Comparator<Nodee> {
   private int dis;
    private int v;
    Nodee(int _dis,int _v){
        dis=_dis;
        v=_v;
    }
    Nodee(){
    }
    int getV(){
        return v;
    }
    int getDis(){
        return dis;
    }

    public int compare(Nodee nodee1,Nodee nodee2){
        if(nodee1.dis<nodee2.dis)
            return -1;
        if(nodee1.dis>nodee2.dis)
            return 1;
        return 0;
    }
}
public class Dijkstra_Algorithm {
    static int[] dijkstra(int n,
                          ArrayList<ArrayList<Nodee>> adj,
                          int S)
    {
        // Write your code here
        int[] dist=new int[n];
        PriorityQueue<Nodee> queue=new PriorityQueue<Nodee>(n,new Nodee());
        queue.add(new Nodee(0,S));
        for (int i = 0; i < n; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[S]=0;
        while (queue.size()>0){
            Nodee node=queue.poll();
            for (Nodee it: adj.get(node.getV())){
                if(dist[node.getV()]+it.getDis()<dist[it.getV()]){
                    dist[it.getV()]=dist[node.getV()]+it.getDis();
                    queue.add(new Nodee(it.getV(),dist[it.getV()]));
                }
            }
        }
        return dist;
    }
}
