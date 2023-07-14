package Array;

import java.util.Arrays;

public class Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int strt=0;
        int end=people.length-1;
        while (strt<=end){
            if(people[strt]+people[end]>limit){
                end--;
            }
            else {
                strt++;
                end--;
            }
            c++;
        }
        return c;
    }
}