package Array;

public class Sign_of_Product {
    public int arraySign(int[] nums) {
        int p = 1;
        for (Integer n : nums) {
            if(n==0){
                return 0;
            }
            if(n<0){
              p*=-1;
            }
            if(n>0){
                p*=1;
            }
        }
        if(p>0)
            return 1;
        else if(p<0)
            return -1;
       else
           return 0;
    }
}
