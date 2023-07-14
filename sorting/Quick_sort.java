package sorting;

public class Quick_sort {
    private static void swap(int[] ar,int l,int h){
        int temp=ar[l];
        ar[l]=ar[h];
        ar[h]=temp;
    }
    public static int partition(int l, int h,int[] a){
        int pivot=a[h];
        int i=l;
        int j=h;
        while(i<j){
            while(a[i]<=pivot && i<j)
                i++;
            while (a[j]>=pivot && i<j)
                j--;
            swap(a,i,j);
        }
        swap(a,i,h);
        return i;
    }
    public static void quick_sort(int l, int h,int[]a){
        if(l<h){
            int pivot=partition(l,h,a);
            quick_sort(l,pivot-1,a);
            quick_sort(pivot+1,h,a);
        }
    }
    public static void main(String args[]){
       int n=7;
       int[] a={4,6,2,5,7,9,1};
       quick_sort(0,n-1,a);
       for(int s: a)
       System.out.print(s+" ");
    }
}
