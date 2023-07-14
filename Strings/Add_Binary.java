package Strings;

public class Add_Binary {
    public String addBinary(String a, String b) {

        StringBuilder res= new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while (i>=0 || j>=0){
            int s=c;
            if(i>=0)
                s+=a.charAt(i--)-'0';
            if(j>=0)
                s+=b.charAt(j--)-'0';
            c=s>1? 1:0;
            res.append(s%2);
        }
        if(c!=0)
            res.append(c);
        return res.reverse().toString();
    }
}
