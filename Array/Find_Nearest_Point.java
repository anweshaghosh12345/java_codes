package Array;

public class Find_Nearest_Point {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int indx=-1;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i <points.length ; i++) {
            int x1=points[i][0];
            int y1=points[i][1];
            if(x1==x || y1==y){
                int d=Math.abs(x-x1)+Math.abs(y-y1);
                if(d<min){
                    min=d;
                    indx=i;
                }
            }
            else {
                continue;
            }
        }
        return indx;
    }
}
