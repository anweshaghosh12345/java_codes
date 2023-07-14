package Strings;

public class Minimum_Characters_For_Palindrome {
    public static int minCharsforPalindrome(String str) {
        //Write your code here
        String rev=reverse(str);
        String s=str+"#"+rev;
        int[] prefix=new int[s.length()];
        makePrefix(prefix,s);
        int n=str.length();
        int k=prefix.length;

        return n-prefix[k-1];
    }
    public static String reverse(String s){
        String n="";
        for (int i =s.length()-1; i >=0; i--) {
            n+=s.charAt(i);
        }
        return n;
    }
    public static void makePrefix(int[] prefix, String needle){
        int i=0,j=1;
        prefix[0]=0;
        while (j<needle.length()){
            if(needle.charAt(i)==needle.charAt(j)){
                i++;
                prefix[j]=i;

                j++;
            }else {
                if(i!=0){
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
        if(checkPalindrom(str))
            return 0;
        int count=0;
        int i= str.length()-2;
            while (!checkPalindrom(str.substring(0,i))&&i>0) {
                count++;
                i--;
            }


        return count;
    }

    static boolean checkPalindrom(String s) {
        int end = s.length() - 1;
        int start = 0;
        while (end >= start) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            else {
                end--;
                start++;
            }
        }
        return true;
    }
 */
