package Strings;

public class String_to_Integer {
    public int myAtoi(String s) {
        int res=0;
        int sign=1;
        int n=s.length();
        int i=0;
        while (i<n && s.charAt(i)==' ')
            i++;
        if(i<n && s.charAt(i)=='+')
        {
            sign=1;
            i++;
        }else if(i<n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        while (i<n && Character.isDigit(s.charAt(i))){
            int dig=s.charAt(i)-'0';
            if ((res > Integer.MAX_VALUE / 10) ||
                    (res == Integer.MAX_VALUE / 10 && dig > Integer.MAX_VALUE % 10)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res=res*10+dig;
            i++;
        }
        return res*sign;
    }
}

