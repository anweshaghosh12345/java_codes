package Strings;
import java.util.*;
public class Letter_Combinations_of_Ph_No_ {
    public void letterCombination(List<String> res,String digits,
                                  String curr,int indx,
                                  String[]mapp){
        if(indx==digits.length()) {
            res.add(curr);
            return;
        }
        String letters=mapp[digits.charAt(indx)-'0'];
        for (char ch:letters.toCharArray()){
            letterCombination(res,digits,curr+ch,indx+1,mapp);
        }


    }
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        if(digits==null || digits.length()==0)
            return res;
        String[] mappings={
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        letterCombination(res,digits,"",0,mappings);
       return res;
    }

}
