package Strings;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
       if(s==null || s.length()<1)
           return "";
       int start=0;
       int end=0;
        for (int i = 0; i < s.length(); i++) {
            int odd_Len=checkpal(s,i,i);
            int even_len=checkpal(s,i,i+1);
            int len=Math.max(odd_Len,even_len);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return s.substring(start,end+1);
    }
    static int checkpal(String s,int left, int right){
        int l=left;int r=right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}

