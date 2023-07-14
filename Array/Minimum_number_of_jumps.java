package Array;

public class Minimum_number_of_jumps {
    static int minJumps(int[] arr){
        // your code here
        if(arr.length<=1)
            return 0;
        if(arr[0]==0)
            return -1;
        int  maxdis=arr[0];
        int step=arr[0];
        int jump=1;
        for (int i = 1; i < arr.length; i++) {
            if(i==arr.length-1)
                return jump;
            maxdis=Math.max(maxdis,i+arr[i]);
            step--;
            if(step==0){
                jump++;
                if(i>=maxdis)
                    return -1;
                step=maxdis-i;
            }
        }
        return -1;
    }
}
