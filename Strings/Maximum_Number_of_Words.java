package Strings;

public class Maximum_Number_of_Words {
    public int mostWordsFound(String[] sentences) {
        int count;
        int max=0;
        for (String str: sentences){
            count=0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==' '){
                    count++;
                }
            }
            max=Math.max(max,count+1);
        }
        return max;
    }
}