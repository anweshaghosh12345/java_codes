package Strings;

public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        String s1="" ;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++) {
            char c1=s.charAt(i);
            if(c1>='a' && c1<='z' || Character.isDigit(c1))
                s1+=c1;
        }

        return check(0,s1.length()-1,s1);
    }
    public boolean check(int start,int end,String s){
        while (start<=end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}