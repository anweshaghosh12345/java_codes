package Stack_and_Queue;

import java.util.Stack;

public class Queue_Using_Stack {
    Stack<Integer> input, output;

    Queue_Using_Stack() {
        // Initialize your data structure here.
        input = new Stack<>();
        output = new Stack<>();
    }

    void enQueue(int val) {
        // Implement the enqueue() function.
        input.push(val);
    }

    int deQueue() {
        // Implement the dequeue() function.
        if (output.empty())
            while (!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        else{
            int x = output.peek();
            output.pop();
            return x;
        }
        if(output.isEmpty()){
            return -1;
        }
        int ans=output.peek();
        output.pop();
        return ans;
    }

    int peek() {
        // Implement the peek() function here.
        if (!output.empty()){
            int ans=output.peek();
            return ans;
        }
        else{
            while (!input.empty()) {
                output.push(input.peek());
                input.pop();
            }
        }
        if(output.isEmpty())
            return -1;
        int ans=output.peek();
        return ans;
    }

    boolean isEmpty() {
        // Implement the isEmpty() function here.
        return output.isEmpty()&&input.isEmpty();
    }
}