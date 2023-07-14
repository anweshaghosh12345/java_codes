package Array;

import java.util.Random;

class Shuffle_an_Array {
    int[]arr;

    public   Shuffle_an_Array(int[] nums){
        arr=nums;
    }

    public  int[] reset(){

        return arr;
    }
    public int[]shuffle(){
        int[] shuffle=arr.clone();
        for (int i = shuffle.length-1; i >=0 ; i--) {
           int index=new Random().nextInt(i+1);
           int temp=shuffle[i];
           shuffle[i]=shuffle[index];
           shuffle[index]=temp;

        }
        return shuffle;
    }
}
