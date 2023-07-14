package Array;

import java.util.Arrays;

public class Count_Inversions {
    static int inversionCount(int arr[], int N)
    {
        // Your Code Here
//        long[] temp=new long[(int) N];
        int ans=  marge_sort(arr,0,N-1);
        return ans;
    }
    public static int marge_sort(int arr[] ,int left,int right){
       int mid, count=0;
       if(right>left){
           mid=left+(right-left)/2;
           count+=marge_sort(arr,left,mid);
           count+=marge_sort(arr,mid+1,right);

           count+=merge(arr,left,mid,right);
       }
       return count;
    }
    public static int merge(int arr[],int left,int mid,int right){
        int[]l= Arrays.copyOfRange(arr, (int) left, (int) (mid+1));
        int[]r=Arrays.copyOfRange(arr, (int) (mid+1), (int) right);
        int count=0;
        int i=0,j=0,k= (int) left;
        while (i<l.length && j<r.length){
            if(l[i]<=r[j])
                arr[k++]=l[i++];
            else {
                arr[k++]=r[j++];
                count+=(mid+1)-(left+i);
            }
        }
       while (i<l.length){
           arr[k++]=l[i++];
       }
       while (j<r.length){
           arr[k++]=r[j++];
       }
        return count;
    }
}
