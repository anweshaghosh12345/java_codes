package Strings;

public class Determine_if_String_Halves_Are_Alike {
    public static int count(String s){
       int c=0;
       for(char ch:s.toCharArray()){
           if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
               c++;
       }
       return c;
    }
    public boolean halvesAreAlike(String s) {
        s=s.toLowerCase();
        int n=s.length()/2;
        int first=count(s.substring(0,n-1));
        int sec=count(s.substring(n,s.length()));
        if(first==sec)
            return true;
        return false;
    }
}
