package Array;

public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length, pbefore = 1, pfter = 1;
        int[] res=new int[n];
        for (int i = 0; i < n; i++) {
          res[i]=pbefore;
          pbefore*=nums[i];
        }
        for (int i = n-1; i >=0 ; i--) {
            res[i]*=pfter;
            pfter*=nums[i];
        }
        return res;
    }
}
