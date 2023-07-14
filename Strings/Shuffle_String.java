package Strings;

import java.util.HashMap;

public class Shuffle_String {
    public String restoreString(String s, int[] indices) {
        HashMap<Integer,Character> hm=new HashMap<>();
        String ans="";
        for (int i = 0; i < indices.length; i++) {
            hm.put(indices[i],s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            ans=ans+hm.get(i);
        }
        return ans;
    }
}
