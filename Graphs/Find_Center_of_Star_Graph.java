package Graphs;

public class Find_Center_of_Star_Graph {
    public int findCenter(int[][] edges) {
        int max=0;
        int[] ar=new int[edges.length+2];
        for (int i = 0; i < edges.length; i++) {
            ar[edges[i][0]]++;
            ar[edges[i][1]]++;
        }
        int val=1;
        for (int i = 0; i <=ar.length-1 ; i++) {
            if(ar[i]>max){
                max=ar[i];
                val=i;
            }
        }
        return val;
    }
}
