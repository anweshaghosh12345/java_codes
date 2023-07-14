package Array;

import java.util.HashMap;
import java.util.Hashtable;

public class word_pattern {
    public boolean wordPattern(String pattern, String s) {

        String[] ass=s.split(" ");
        if(ass.length !=pattern.length())
            return false;

        HashMap<Character,String> hm_p=new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char cur_char=pattern.charAt(i);
            if(hm_p.containsKey(cur_char)){
                if(!hm_p.get(cur_char).equals(ass[i])){
                    return false;
                }
            }else {
                if(hm_p.containsValue(ass[i])){
                    return false;
                }
                hm_p.put(cur_char,ass[i]);
            }
        }
        return true;
    }
}
