package Strings;

public class Backspace_String_Compare {
    public boolean backspaceCompare(String s, String t) {
        int i=s.length()-1;
        int j=t.length()-1;
        int skip_s=0;
        int skip_t=0;
        while (i>=0 || j>=0){
            while (i>=0){
                if(s.charAt(i)=='#'){
                    skip_s++;
                    i--;
                }
                else if(skip_s>0){
                    skip_s--;
                    i--;
                }
                else break;
            }
            while (j>=0){
                if(t.charAt(j)=='#'){
                    skip_t++;
                    j--;
                }
                else if(skip_t>0){
                    skip_t--;
                    j--;
                }
                else break;
            }
            if(i>=0 && j>=0 && s.charAt(i)!=t.charAt(j))
                return false;
            if((i>=0) != (j>=0))
                return false;
            i--;
            j--;
        }
        return true;
    }
}
