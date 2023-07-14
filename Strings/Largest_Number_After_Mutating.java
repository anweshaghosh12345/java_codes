package Strings;

public class Largest_Number_After_Mutating {
    public String maximumNumber(String num, int[] change) {
        String ans="";
        int n=num.length();
        for(int i=0;i<n;i++){
            char ch=num.charAt(i);
            int w=Character.getNumericValue(ch);
            if(w<change[w])
                ans+=change[w];
            else
                ans+=ch;
        }
        return ans;
    }
}
