package Strings;

public class Pairs_of_Strings_With_Concatenation {
    public int numOfPairs(String[] nums, String target) {
        int c=0;

        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j <nums.length ; j++) {
                if(i!=j) {
                    String cur = nums[i] + nums[j];
                    if (cur.equals(target))
                        c++;
                }
            }
        }
        return c;
    }
}
