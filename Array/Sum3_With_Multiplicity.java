package Array;

public class Sum3_With_Multiplicity {
    public int threeSumMulti(int[] arr, int target) {
        int c=0;
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j <arr.length-1 ; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if(arr[i]+arr[j]+arr[k]==target){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}