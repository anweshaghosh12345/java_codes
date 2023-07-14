package Strings;

public class Permutation_String {
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length())
            return false;
        char [] chars1 =new char[26];
        char [] chars2=new char[26];
        int l=0,r=0;
        while(r<s1.length()) {
            chars1[s1.charAt(r)-'a']++;
            chars2[s2.charAt(r)-'a']++;
            r++;
        }
        r--;
        while (r<s2.length()){
            if(matches(chars1,chars2))
                return true;
            r++;
            if(r!=s2.length())
                chars2[s2.charAt(r)-'a']++;
            chars2[s2.charAt(l)-'a']--;
            l++;
        }
        return false;
    }
    boolean matches(char []s1,char []s2){
        int l=25;
        while (l>0){
            if(s1[l] != s2[l]){
                return false;
            }
            l--;
        }
        return true;
    }
}
