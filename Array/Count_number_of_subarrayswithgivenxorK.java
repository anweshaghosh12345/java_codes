package Array;

import java.util.HashMap;

/*public class Count_number_of_subarrayswithgivenxorK {
    public int solve(int[] A, int B) {
        int xor=0;
        int count=0;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            xor=xor^A[i];
            if(hashMap.get(xor^B)!= null){
                count+=hashMap.get(xor^B);
            }if(xor==B)
                count++;
            if(hashMap.get(xor)!=null){
                hashMap.put(xor,hashMap.get(xor)+1);
            }else {
                hashMap.put(xor,1);
            }
        }
        return count;
    }
}

 */
import java.io.*;

