package Stack_and_Queue;

public class Implement_Queue {
    int count;
    int size;
    int[] arr;
    int front,rare;
    Implement_Queue() {
        // Implement the Constructor
        count=0;
        front=0;
        rare=0;
        size=100001;
        arr=new int[size];
    }

    /*----------------- Public Functions of Queue -----------------*/

    boolean isEmpty() {
        // Implement the isEmpty() function
        return (front==rare);
    }

    void enqueue(int data) {
        // Implement the enqueue() function
        if(count<size) {
            arr[rare%size]=data;
            rare++;
            count++;
        }

    }

    int dequeue() {
        // Implement the dequeue() function
        if(count==0)
            return -1;
        int x=arr[front%size];
        front++;
        count--;
        return x;
    }

    int front() {
        // Implement the front() function
        if(count==0)
            return -1;
        else
            return arr[front%size];
    }

}


