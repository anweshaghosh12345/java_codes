package Array;

public class Koko_Eating_Bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left =1, right =1;

        for(int max: piles){
            right=Math.max(max,right);
        }
        while (left != right) {
            int mid = left + (right - left) / 2;
            int hr=0;
            for(int p: piles){
                hr +=Math.ceil((double) p/mid);
            }
            if(hr <= h){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return right;
    }
}
