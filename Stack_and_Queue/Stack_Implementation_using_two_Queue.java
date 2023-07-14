package Stack_and_Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Stack_Implementation_using_two_Queue {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public Stack_Implementation_using_two_Queue() {
        // Implement the Constructor.
        q1=new PriorityQueue<>();
        q2=new PriorityQueue<>();
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() {
        // Implement the getSize() function.
        return  q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function.
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function.
        q2.add(element);
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.remove();
        }
        while (!q2.isEmpty()) {
            q1.add(q2.peek());
            q2.remove();
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