package Array;

public class Find_Three_Consecutive_Integer {
    public long[] sumOfThree(long num) {
        num=num-3;
        if(num %3 !=0)
            return new long[0];
        long[] ar=new long[3];
        num/=3;
        ar[0]=num++;
        ar[1]=num++;
        ar[2]=num;
        return ar;
    }
}
