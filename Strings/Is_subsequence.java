package Strings;

public class Is_subsequence {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        while (j<s.length() && i<t.length()){
            if(s.charAt(j)==t.charAt(i)){
                j++;
            }
            i++;
        }
         return j==s.length();
    }
}
