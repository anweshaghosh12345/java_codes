package Strings;

public class Detect_Capital {
    public boolean detectCapitalUse(String word) {
        int n=word.length();
        if(n==1)
            return true;
        if (Character.isUpperCase(word.charAt(0)) &&
                Character.isUpperCase(word.charAt(1))) {

            for (int i = 2; i < n; i++) {
                if(Character.isLowerCase(word.charAt(i)))
                    return false;
            }
        }
        else {
                for (int i = 1; i < n; i++) {
                    if(Character.isUpperCase(word.charAt(i)))
                        return false;
                }

        }

       return true;
    }
}

/**
 *  boolean check1=true;
 *         boolean check2=true;
 *         boolean check3=true;
 *
 * //        for all capital check1
 *         for (int i = 0; i < n; i++) {
 *             char ch =word.charAt(i);
 *             if(!Character.isUpperCase(ch)) {
 *                 check1 = false;
 *                 break;
 *             }
 *             else {
 *                 check1=true;
 *             }
 *         }
 *         if(check1)
 *             return true;
 *
 * //        for all lower check2
 *         for (int i = 0; i < n; i++) {
 *             char ch =word.charAt(i);
 *             if(Character.isUpperCase(ch)) {
 *                 check2 = false;
 *                 break;
 *             }
 *             else {
 *                 check2=true;
 *             }
 *         }
 *         if(check2)
 *             return true;
 *
 * //        for 1st letter uppercase check3
 *         for (int i = 0; i < n; i++) {
 *             char ch =word.charAt(i);
 *             if( Character.isUpperCase(ch) && i!=0) {
 *                 check3 = false;
 *                 break;
 *             }
 *             else {
 *                 check3=true;
 *             }
 *         }
 *         if(check3)
 *             return true;
 *
 *         return false;
 */