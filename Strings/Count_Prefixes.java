package Strings;

public class Count_Prefixes {
    public int countPrefixes(String[] words, String s) {
        int c=0;
//        char[] s1=s.toCharArray();
        for (int i = 0; i < words.length; i++) {
            if(s==words[i]){
                c++;
            }
            else if(s.substring(i)==words[i]){
                c++;
            }
        }
        return c;
    }
}
