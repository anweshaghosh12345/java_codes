package Strings;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping {
    public String freqAlphabets(String s) {
        StringBuilder sb=new StringBuilder();
        int n=s.length();
        for (int i=n-1;i>=0;i--){
            if(s.charAt(i)>='1'&& s.charAt(i)<='9'){
                sb.insert(0,(char) (s.charAt(i)-'1'+'a'));
            }else {
                int num=Integer.valueOf(s.substring(i-2,i));
                sb.insert(0,(char) ('a'+num-1));
                i-=2;
            }
        }
        return sb.toString();
    }
}
