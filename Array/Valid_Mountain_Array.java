package Array;

public class Valid_Mountain_Array {
    public boolean validMountainArray(int[] arr) {

        int max=arr[0];
        int pos=0;
        for (int i = 1; i < arr.length; i++) {
            if(max<=arr[i]){
              max=arr[i];
              pos=i;
            }
        }
        if(pos==0 || pos==arr.length-1)
            return false;
//        int m=arr[0];
        for (int i = 0; i < pos; i++) {
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for (int i = pos; i <arr.length-1 ; i++) {
           if(arr[i]<=arr[i+1]){
               return false;
           }
        }
        return true;
    }
}
