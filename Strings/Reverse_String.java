package Strings;

import java.util.Collections;

public class Reverse_String {
    public void reverseString(char[] s) {

        int end=s.length-1;
        int start=0;
        while(end>start) {
            char temp=s[end];
            s[end]=s[start];
            s[start]=temp;
            start++;
            end--;
        }
    }
}
