package Array;

public class Majority_Element {
    public int majorityElement(int[] nums) {
        int c=0;
        int el=0;
        for(int n:nums){
            if(c==0)
                el=n;
            if(n==el)
                c++;
            else
                c--;
        }
        return  el;
    }
}