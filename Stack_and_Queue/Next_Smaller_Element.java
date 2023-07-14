package Stack_and_Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Next_Smaller_Element {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        s.push(-1);
        for (int i = n-1; i >=0 ; i--) {
            while (!s.isEmpty() && s.peek()>=arr.get(i))
                s.pop();
            if(i<n) {
                if(!s.isEmpty())
                    res.add(s.peek());
                else
                    res.add(-1);
            }
            s.push(arr.get(i));

        }
        Collections.reverse(res);
        return res;
    }
}