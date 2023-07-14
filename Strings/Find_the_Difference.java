package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class Find_the_Difference {
    public char findTheDifference(String s, String t) {
        int tlen=t.length();
        int slen=s.length();

        HashMap<Character,Integer> hm=new HashMap<>();
        for (char ch : s.toCharArray()) {
           hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for (char tc : t.toCharArray()){
            hm.put(tc,hm.getOrDefault(tc,0)-1);
        }
        for (char x : hm.keySet()){
            if(hm.get(x) != 0)
                return x;
        }
        return '0';
    }
}
