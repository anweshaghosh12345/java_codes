package BinarySearch;

public class Median_of_Two_Sorted_Arrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length)
            return findMedianSortedArrays(nums2,nums1);
        int n1= nums1.length;;
        int n2=nums2.length;
        int low=0;
        int high=n1;
//        medianPos=((m+n)+1)/2
        while (low<=high) {
            int cut1=(low+high)/2;
            int cut2=(((n2+n1)+1)/2)-cut1;
            int l1 =(cut1==0)? Integer.MIN_VALUE:nums1[cut1-1];
            int l2 = (cut2==0)? Integer.MIN_VALUE:nums2[cut2-1];
            int r1 =(cut1==n1)? Integer.MAX_VALUE:nums1[cut1];
            int r2 =(cut2==n2)? Integer.MAX_VALUE:nums2[cut2];
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2==0)
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                else
                    return Math.max(l1,l2);
            }else if(l1>r1)
                high=cut1-1;
            else
                low=cut1+1;
        }
        return 0.0;
    }
}
/*
int[] nums=new int[nums1.length+nums2.length];
        int c=0;
        int n1=0;
        int n2=0;
        while (n1<nums1.length && n2< nums2.length){
            if(nums1[n1]<nums2[n2]){
                nums[c]=nums1[n1];
                n1++;
            }
            else {
                nums[c]=nums2[n2];
                n2++;
            }
                c++;
        }
        if(n1<nums1.length)
            while (n1<nums1.length){
                nums[c++]=nums1[n1++];
            }
        if(n2<nums2.length)
            while (n2<nums2.length){
                nums[c++]=nums2[n2++];
            }
        double ans=0.00000;
        int mid=nums.length /2;
        if(nums.length%2==0){

          ans=(nums[mid-1]+nums[mid])/2.000;
        }
        else
            return nums[mid];
        return ans;
    }
}
//1 2 3 4 5 6
 */