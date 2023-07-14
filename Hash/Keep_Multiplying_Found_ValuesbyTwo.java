package Hash;

import java.util.HashSet;

public class Keep_Multiplying_Found_ValuesbyTwo {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hashSet=new HashSet<>();
        for (int n: nums){
            hashSet.add(n);
        }
        int s=original;
        while (hashSet.contains(s)){
            s*=2;
        }
        return s;
    }
}
