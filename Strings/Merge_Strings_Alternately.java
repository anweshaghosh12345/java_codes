package Strings;

public class Merge_Strings_Alternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        int i = 0;

        while(i < minLen) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i++));
        }

        while(i < len1) sb.append(word1.charAt(i++));
        while(i < len2) sb.append(word2.charAt(i++));

        return sb.toString();
    }
}
