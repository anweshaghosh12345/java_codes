package Array;

public class Find_NumberswithEvenNumber_of_Digits {
    public int findNumbers(int[] nums) {
        int c=0;
        for (int i = 0; i < nums.length; i++) {
            if(count(nums[i])%2==0)
                c++;
        }
        return c;
    }
    static int count(int n){
        int c=0;
        while (n!=0){
            n=n/10;
            c++;
        }
        return c;
    }
}
