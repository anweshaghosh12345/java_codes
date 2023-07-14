package Strings;

public class Reverse_Words_in_String_I {
    public String reverseWords(String s) {
      String strArr[]=s.trim().split("\s+");
      String ans=new String();
        int end=strArr.length-1;
        int start=0;
        while (end>start){
            String temp=strArr[end];
            strArr[end]=strArr[start];
            strArr[start]=temp;
            end--;
            start++;
        }
        for (String w: strArr) {
            StringBuilder sb=new StringBuilder(w);
            ans+=sb.toString().trim()+" ";
        }
      return ans.trim();
    }
}