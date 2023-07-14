package Array;

public class Place_Flowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//    0 1 0 0 0 1 0 0

        int c=0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0 &&( i==0 || flowerbed[i-1]==0 )&& (i==flowerbed.length-1||flowerbed[i+1]==0))
            {
                flowerbed[i]=1;
                c++;
            }
        }
        if(c>=n)
            return true;
        else
            return false;

    }
}
