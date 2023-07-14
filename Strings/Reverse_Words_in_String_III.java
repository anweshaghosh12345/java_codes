package Strings;

public class Reverse_Words_in_String_III {
    public String reverseWords(String s) {
        String strArr[] =s.split(" ");
        String ans=new String();
        for (String w : strArr) {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            ans+=" "+sb.toString();
        }
        return ans.trim();
    }
}