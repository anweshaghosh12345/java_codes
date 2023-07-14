package Strings;

import java.util.Locale;

public class Capitalize_the_Title {
    public String capitalizeTitle(String title) {

        String strArr[]=title.split(" ");
        String ans=new String();
        String sb =new String();
        for (String w : strArr) {
            sb=w.toLowerCase();

            if(sb.length()>2){
                sb=w.substring(0,1).toUpperCase();

            }
            else
                sb=w.substring(0,1).toLowerCase();
            ans+=" "+sb+w.substring(1).toLowerCase();
        }
        return ans.trim();
    }
}
