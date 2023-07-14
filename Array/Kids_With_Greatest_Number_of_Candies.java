package Array;
import java.util.*;
public class Kids_With_Greatest_Number_of_Candies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >max){
                ans.add(true);
            }
            else {
                ans.add(false);
            }
        }
        return ans;
    }
}
