package Array;

public class Sort_an_Array {
    public int[] sortArray(int[] nums) {
        MergeSort(nums,0,nums.length-1);
        return nums;
    }
    void MergeSort(int[] num, int start, int end){
        if(start <end){
            int mid=(start+end)/2;
            MergeSort(num,start,mid);
            MergeSort(num,mid,end);
            Merge(num,start,end);
        }
    }
    void Merge(int nums[],int start,int end){
        int mid=start+(end-start)/2;
        int temp[]=new int[end-start+1];

    }
}