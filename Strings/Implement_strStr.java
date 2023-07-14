package Strings;

public class Implement_strStr {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        int[] prefix=new int[m];
        makePrefix(prefix,needle);
        int j=0,i=0;
        while (i<n&&j<m){
            if(haystack.charAt(i)==needle.charAt(j)){
                i++;j++;
            }
            else {
                if(j-1>=0)
                    j=prefix[j-1];
                else i++;
            }
        }
        if(j==m)
            return i-j;
        else
            return -1;

    }
    public void makePrefix(int[] prefix, String needle){
        int i=0,j=1;
        while (j<needle.length()){
            if(needle.charAt(i)==needle.charAt(j)){
                prefix[j]=i+1;
                i++;
                j++;
            }else {
                if(i-1>=0){
                    i=prefix[i-1];
                }
                else {
                    prefix[j]=0;
                    j++;
                }
            }
        }
    }
}
/*
if(needle.length()>haystack.length())
            return -1;
        else if(needle.length()==0)
            return 0;

        return     haystack.indexOf(needle);
 */