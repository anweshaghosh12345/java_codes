package Strings;

import java.util.HashMap;
import java.util.Hashtable;

public class Ransom_Note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int m=magazine.length();
        int r=ransomNote.length();
        if(m<r)
            return false;

        HashMap<Character,Integer> hm1= new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for (int i = 0; i < m; i++) {
            hm1.put(magazine.charAt(i), hm1.getOrDefault(magazine.charAt(i),0)+1);
        }
        for (int i = 0; i < r; i++) {
            hm2.put(ransomNote.charAt(i),hm2.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for (char c:ransomNote.toCharArray()) {
            if(hm2.getOrDefault(c,0) >
            hm1.getOrDefault(c,0))
                return false;
        }
        return true;
    }
}
