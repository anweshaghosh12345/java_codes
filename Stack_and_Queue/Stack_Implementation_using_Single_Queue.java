package Stack_and_Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Stack_Implementation_using_Single_Queue {
    Queue<Integer> q1;
   int size;
    public Stack_Implementation_using_Single_Queue() {
        // Implement the Constructor.
        q1=new PriorityQueue<>();
        size=0;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        // Implement the getSize() function.

        return  size;
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        q1.add(element);
        size++;
        int c=size-1;
        while (c>0){
            int e=q1.peek();
            q1.remove();
            q1.add(e);
            c--;
        }
    }

    public int pop() {
        // Implement the pop() function.
        int ans=0;
        if(q1.isEmpty())
            return -1;
        else {
            ans= q1.peek();
            q1.remove();
            size--;
        }
       return ans;
    }

    public int top() {
        // Implement the top() function.
        if(q1.isEmpty())
            return -1;
        else
        return q1.peek();
    }
}
