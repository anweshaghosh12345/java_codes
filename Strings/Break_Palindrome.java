package Strings;

public class Break_Palindrome {
    public String breakPalindrome(String palindrome) {
      if(palindrome.length()<2)
          return "";
      String ans="";
      int n=palindrome.length();
      char[] ar=palindrome.toCharArray();
          for (int i = 0; i <n/2; i++) {
                if(ar[i]!='a')
                {
                    ar[i]='a';
                    return new String(ar);
                }
          }
      ar[n-1]='b';

      return new String(ar);
    }
}
