package Strings;

public class Reverse_String_II {
    public String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        for (int i = 0; i < n; i+=2*k) {
            rotate(arr,i,Math.min(i+k-1,n-1));
        }


        return new String(arr);
    }
    public  void rotate(char[] s,int start,int end){
        char temp=s[end];
        s[end]=s[start];
        s[start]=temp;
        start++;
        end--;
    }
}
