package Strings;

import java.util.*;

public class Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> map=new HashMap<>();
        Set<Character> assigned=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(map.containsKey(ch1)&& map.get(ch1)!=ch2)
                return false;
            if(!map.containsKey(ch1) && map.containsValue(ch2))
                return false;
            map.put(ch1,ch2);
        }
        return true;
    }
}
