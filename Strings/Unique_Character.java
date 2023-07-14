package Strings;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;

public class Unique_Character {
    public int firstUniqChar(String s) {

        HashMap<Character,Integer> hm=new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i),0)+1);

        }
        for (int i = 0; i < s.length(); i++) {
            if(hm.get(s.charAt(i))==1)
                return i;
        }
        return -1;
    }
}
