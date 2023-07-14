package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> ans=new ArrayList<>();
        int len=num.length-1;
        int cur=k;
        //int carry= 0;
        int i=len;
         while (i>=0 || cur>0 ){
             if(i>=0)
              cur+=num[i];
             ans.add(cur%10);
             cur/=10;
             i--;
         }
        Collections.reverse(ans);
        return ans;
    }
}
