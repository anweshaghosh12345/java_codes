package Array;

public class Trapping_Rainwater {
    public int trap(int[] height) {
        int count=0;
        int n=height.length;
        int max1=0;
        int max=0;
        int[] leftMax=new int[n];
        int[] rightMax=new int[n];
        leftMax[0]=height[0];
        for (int i = 0; i < n; i++) {

            max=Math.max(max,height[i]);
            leftMax[i]=max;
        }
        for (int i =n-1;i>=0;i--) {

            max1=Math.max(max1,height[i]);
            rightMax[i]=max1;
        }
        for (int i = 0; i < n; i++) {
            count+=Math.min(leftMax[i],rightMax[i] )-height[i];
        }
        return count;
    }
}
