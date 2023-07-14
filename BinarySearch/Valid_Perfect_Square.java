package BinarySearch;

public class Valid_Perfect_Square {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;

        int start=1;
        int end=num/2;
//        int mid;
        while (start<=end){
            long mid=start+((end-start)/2);
            if(num>mid*mid)
                start=(int)mid+1;

            else if(num<mid*mid)
                end=(int)mid-1;
            else
                return true;
        }
        return false;
    }
}
