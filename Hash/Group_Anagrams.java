package Hash;

import java.util.*;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map=new HashMap<>();

        for (int i = 0; i <strs.length ; i++) {
            String s1=strs[i];
            char[] arr=s1.toCharArray();
            Arrays.sort(arr);
            String s=new String(arr);
            if(map.containsKey(s)){
                map.get(s).add(s1);
            }else {
                map.put(s,new ArrayList<>());
                map.get(s).add(s1);
            }
        }
        return new ArrayList<>(map.values());
    }
}