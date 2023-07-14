package Stack_and_Queue;

import java.util.Stack;

public class Next_Greater_Elements {
    public int[] nextGreaterElements(int[] nums){
        int res[] =new int[nums.length];
        int n= nums.length;
        Stack<Integer> s=new Stack<>();
        for (int i = 2*n-1; i >=0 ; i--) {
            while (!s.isEmpty() && s.peek()<=nums[i%n])
                s.pop();
           if(i<n) {
               if(!s.isEmpty())
                   res[i]=s.peek();
               else
                   res[i]=-1;
           }
               s.push(nums[i%n]);

        }
        return res;
    }
}
