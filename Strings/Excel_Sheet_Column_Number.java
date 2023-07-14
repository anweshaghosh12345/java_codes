package Strings;

public class Excel_Sheet_Column_Number {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for (int i=0;i<columnTitle.length();i++){
          int d = columnTitle.charAt(i) - 'A'+1;
          res=res*26+d;
        }
        return res;
    }
}
