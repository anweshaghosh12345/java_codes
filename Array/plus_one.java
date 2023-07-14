package Array;

import java.util.ArrayList;
import java.util.Collections;

public class plus_one {
    public int[] plusOne(int[] digits) {
        int carry =1;
        int sum =0;
        int n=digits.length;
        for (int i = n-1;i>=0; i--) {
            sum=digits[i]+carry;
            if(sum>=10){
                carry=sum/10;
                digits[i]=sum%10;
            }
            else {
                digits[i]=sum;
                carry=0;
            }
        }

        if( carry !=0){
            int[] ans=new int[n+1];
            ans[0]=1;
            for (int i = 0; i < n; i++) {
                ans[i+1]=digits[i];
            }
            return ans;
        }

        return digits;

    }
}
