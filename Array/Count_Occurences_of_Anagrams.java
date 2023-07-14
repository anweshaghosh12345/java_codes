package Array;

import java.util.Arrays;

public class Count_Occurences_of_Anagrams {
    int search(String pat, String txt) {
        // code here
        int c=0;
        char [] sort_pat=pat.toCharArray();
        Arrays.sort(sort_pat);
        char[] text=txt.toCharArray();
        for(int i=0;i<text.length-sort_pat.length;i++){
            String temp="";
            for (int j=0;j<sort_pat.length+i;j++){
                temp+=text[j];
                char[] arrtemp=temp.toCharArray();
                Arrays.sort(arrtemp);
                temp=new String(arrtemp);
                if(sort_pat==(arrtemp))
                    c++;
            }
        }
        return c;

    }
}
