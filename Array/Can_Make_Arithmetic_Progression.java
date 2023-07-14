package Array;

import java.util.Arrays;

public class Can_Make_Arithmetic_Progression {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length-3; i++) {
            if(arr[i-1]-arr[i]!=arr[i]-arr[i+1])
                return false;
        }
        return true;
    }
}
