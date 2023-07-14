package Strings;

import java.util.Arrays;

public class String_Swap {
    public boolean areAlmostEqual(String s1, String s2) {
        char t1[]=s1.toCharArray();
        char t2[]=s2.toCharArray();
        Arrays.sort(t1);
        Arrays.sort(t2);
        String st1=String.valueOf(t1);
        String st2=String.valueOf(t2);
        if(!st1.equals(st2))
            return false;
        int c=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(2))
                c++;
        }
        if(c>2)
            return false;
        return true;
    }
}
