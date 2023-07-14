package Strings;

import javax.management.StringValueExp;
import java.util.Collections;

public class Multiply_Strings {
    public String multiply(String num1, String num2) {
       int m=num1.length();
       int n=num2.length();
       if(n==0 || m==0 || "0".equals(num1) || "0".equals(num2))
           return "0";
       if("1".equals(num1))
           return num2;
       if("1".equals(num2))
           return num1;
       int[] res=new int[n+m];
       for(int i=m-1;i>=0;i--){
           for(int j=n-1;j>=0;j--){
               int product=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
               product+=res[i+j+1];
               res[i+j+1]=product%10;
               res[i+j]+=product/10;
           }
       }
       StringBuilder sb=new StringBuilder();
       for (int r:res){
            if(sb.length()==0 && r==0)
                continue;
            sb.append(r);
       }
       return sb.toString();
    }
}
