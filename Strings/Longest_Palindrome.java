package Strings;

import java.util.HashMap;

public class Longest_Palindrome {
    public int longestPalindrome(String s) {

        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hashMap.put(ch,hashMap.getOrDefault(ch,0)+1);
        }
        int even=0;
        boolean odd=false;
        for (int x: hashMap.values()){
            if(x%2!=0) {
                odd = true;
            }
            even+=x/2;
        }
        return even*2+(odd?1:0);
    }
}
