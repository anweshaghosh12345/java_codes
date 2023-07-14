package Strings;

import java.util.HashMap;

public class Count_and_Say {
    public String countAndSay(int n) {
         if(n==1)
             return "1";
         String s=countAndSay(n-1);
         int c=0;
        String res="";
        for (int i = 0; i < s.length(); i++) {
            c++;
//            separating groups
            if(i==s.length()-1|| s.charAt(i)!=s.charAt(i+1)){

                res=res+c+s.charAt(i);
                c=0;
            }
        }
        return res;
    }
}