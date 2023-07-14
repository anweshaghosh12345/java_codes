package Strings;

public class Min_LengthAfterDeleting_Similar_Ends {
    public int minimumLength(String s) {
        int i=0;
        int j =s.length()-1;
        while (i<=j){
            if(s.charAt(i)==s.charAt(j)){
                while (i<s.length() && s.charAt(i+1)==s.charAt(j)) {
                    i++;
                }
                while (j>0 && s.charAt(j-1)==s.charAt(i) ){
                    j--;
                }
            }
            if(i==j)
                return 1;
            else {
                return j-i+1;
            }

        }
        return 0;
    }
}
