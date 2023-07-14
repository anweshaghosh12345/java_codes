package Strings;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()==0 || s== null)
            return res;

        int[] char_count = new int[26];
        for(char c : p.toCharArray()){
            char_count[c-'a']++;
        }
        int left =0;
        int right = 0;
        int count = p.length();
        while (right < s.length()){
          if(char_count[s.charAt(right++)-'a']-- >=1)
              count--;
          if(count==0)
              res.add(left);
          if(right-left == p.length() &&
                  char_count[s.charAt(left++)-'a']++ >=0)
              count++;
        }
        return res;
    }
}
