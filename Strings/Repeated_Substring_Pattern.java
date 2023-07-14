package Strings;

public class Repeated_Substring_Pattern {
    public boolean repeatedSubstringPattern(String s) {
        String temp="";
        for (int i = 0; i < s.length()/2; i++) {
            temp+=s.charAt(i);
            if(s.length()%temp.length()==0){
                int len=s.length()/temp.length();
                StringBuilder str=new StringBuilder();
                for (int j = 0; j < len; j++) {
                    str.append(temp);
                }
                if(str.toString().equals(s))
                    return true;
            }
        }
        return  false;
    }
}