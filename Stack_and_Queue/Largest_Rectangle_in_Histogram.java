package Stack_and_Queue;

import java.util.Map;
import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public int largestRectangleArea(int[] heights) {

        int n=heights.length;
        int max=0;
        Stack<Integer> s=new Stack<>();
        int[] leftSmall=new int[n];
        int[] rightSmall=new int[n];

        for (int i = 0; i < n; i++) {
            while(!s.isEmpty() && heights[s.peek()] > heights[i])
                s.pop();
            if(!s.isEmpty())
                leftSmall[i]=s.peek()+1;
            else
                leftSmall[i]=0;
            s.push(i);
        }
        while (!s.isEmpty())
            s.pop();

        for (int i = n-1; i >=0 ; i--) {
            while(!s.isEmpty() && heights[s.peek()] > heights[i])
                s.pop();
            if(!s.isEmpty())
                rightSmall[i]=s.peek()-1;
            else
                rightSmall[i]=n-1;
            s.push(i);
        }
        for (int i = 0; i < n; i++) {
            max= Math.max(max,(rightSmall[i]-leftSmall[i])*heights[i]);
        }
        return max;
    }
}
