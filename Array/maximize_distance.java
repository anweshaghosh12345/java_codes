package Array;

public class maximize_distance {
    public int maxDistToClosest(int[] seats) {
        int len=-1;
        int ans=0;
        int n=seats.length;

        for (int i = 0; i < n; i++) {
           if(seats[i]==1){
            if(len==-1)
                ans=i;
            else
                ans=Math.max((i-len)/2,ans);
            len=i;
           }
        }
        if(seats[n-1]==0)
            ans = Math.max(ans,n-1-len);
        return ans;
    }
}
