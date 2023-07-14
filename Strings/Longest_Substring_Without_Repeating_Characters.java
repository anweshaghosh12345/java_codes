package Strings;

import java.util.*;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {

        int c=0;
        int left=0;
        int right=0;
        HashMap<Character,Integer> map=new HashMap<>();
        while(right<s.length()){
            if(map.containsKey(s.charAt(right))){
                left=Math.max(map.get(s.charAt(right)+1),left);
            }
            map.put(s.charAt(right),right);
            c=Math.max(c,right-left+1);
            right++;
        }
        return c;
    }
}
