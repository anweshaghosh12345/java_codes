package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Letter_Case_Permutation {
    List<String> stringList =new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        if(s==null || s.length()==0)
            return stringList;

        string_permutation(s,0,new StringBuilder());
        return stringList;
    }
    public void string_permutation(String s,int idx, StringBuilder str){
        if(idx==s.length()){
            stringList.add(str.toString());
            return;
        }
        char ch=Character.toLowerCase(s.charAt(idx));

        str.append(ch);
        string_permutation(s,idx+1,str);
        str.deleteCharAt(str.length()-1);
        if(Character.isLetter(ch)) {
            ch=Character.toUpperCase(ch);
            str.append(ch);
            string_permutation(s, idx + 1, str);
            str.deleteCharAt(str.length() - 1);
        }
    }

}
