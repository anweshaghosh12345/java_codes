package Array;

import java.util.Arrays;

public class Find_Unique_Binary_String {
    public String findDifferentBinaryString(String[] nums) {
        String res="";
        return find(res,nums);
    }
    public String find(String res, String[] nums){
        if(res.length()==nums.length) {
            if (!Arrays.asList(nums).contains(res))
                return res;
            return "";
        }
        String temp="";
        temp=find(res+"0",nums);
        if(!temp.isEmpty() && temp.length()== nums.length)
            return temp;
        String temp2=find(res+"1",nums);
        if(!temp2.isEmpty() && temp2.length()== nums.length)
            return temp2;
        return res;

    }
}
