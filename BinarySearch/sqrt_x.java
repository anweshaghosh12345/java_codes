package BinarySearch;

public class sqrt_x {
    public int isPerfectSquare(int x) {
        if(x==1)
            return 1;
        long start=1;
        long end=x/2;
        long r=0;
        while (start<=end){
            long mid=start+(end-start)/2;
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid<x)
            {
                r=mid;
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return (int)r;

    }
}
