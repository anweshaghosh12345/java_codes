package Strings;

public class ValueVariableAfterPerformingOperations {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for (String s:operations){
            if(s.equals("++X")|| s.equals("X++"))
                sum++;
            else if(s.equals("--X")|| s.equals("X--")) {
                sum--;
            }
        }
        return sum;
    }
}