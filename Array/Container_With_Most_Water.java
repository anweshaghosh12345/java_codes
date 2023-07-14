package Array;

public class Container_With_Most_Water {
    public int maxArea(int[] height) {
    int start=0;
    int end=height.length-1;
    int max_area=0;
    while (start<end){
        max_area=Math.max(max_area, (end-start)*Math.min(height[start],height[end]));
        if(height[start]>height[end])
            end--;
        else {
            start++;
        }
    }
    return max_area;
    }
}
