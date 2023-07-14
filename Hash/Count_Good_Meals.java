package Hash;

import java.util.HashMap;

public class Count_Good_Meals {
    public int countPairs(int[] deliciousness) {
        int mod=1000000007;
        long c=0;
        HashMap<Integer,Integer>  hashMap=new HashMap<>();
        for (int i: deliciousness) {
            int pow=1;
            for (int j = 0; j < 22; j++) {
                if(hashMap.containsKey(pow-i)){
                    c+=hashMap.get(pow-i);
                    c%= mod;
                }
                pow *=2;
            }
            hashMap.put(i,hashMap.getOrDefault(i,0)+1);
        }
        return (int)c;
    }
}