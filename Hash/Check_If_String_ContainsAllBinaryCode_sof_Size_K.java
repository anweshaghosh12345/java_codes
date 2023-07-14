package Hash;

import java.util.HashSet;
import java.util.Set;

public class Check_If_String_ContainsAllBinaryCode_sof_Size_K {
    public boolean hasAllCodes(String s, int k) {
        int count=0;
        int str=0;
        Set hashSet=new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            count++;
             if(count==k){
                hashSet.add(s.substring(str,str+k));
                str++;
                count--;
            }
        }
        if(hashSet.size()==Math.pow(2,k))
            return true;
        else
            return false;
    }
}
