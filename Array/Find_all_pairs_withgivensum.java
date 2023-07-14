package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
public class Find_all_pairs_withgivensum {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here
        ArrayList<pair> p=new ArrayList<>();
        HashSet<Long> set=new HashSet<>();

        Arrays.sort(A);
        for(long b:B ){
            set.add(b);
        }
        for (int i = 0; i < N; i++) {
            if(set.contains(X-A[i]))
                p.add(new pair(A[i],X-A[i]));
        }
        return p.toArray(new pair[p.size()]);
    }
}
