package Strings;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int n=s.length();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);
       int res=map.get(s.charAt(n-1));

        for (int i = n-2; i >=0; i--) {
           if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
               res-=map.get(s.charAt(i));
           }
           else
               res+=map.get(s.charAt(i));
        }
       return res;
    }
}
