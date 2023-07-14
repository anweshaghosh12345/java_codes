package Stack_and_Queue;

public class stack_using_arrays {
    public static void main(String args[]){
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.top);
        s.pop();
        System.out.println(s.top);
//        System.out.println(s.isEmpty());
    }
}
class stack{
    int size=1000;
    int[] arr=new int[size];
    int top=-1;
    void push(int x){
        arr[++top]=x;
    }
    void pop(){
        top--;
//       return top;
   }
    int top(int top)
    {
        return arr[top];
    }
    int size(int top){
        return top+1;
    }
    boolean isEmpty(int top){
        if(top==-1)
            return true;
        else
            return false;
    }
}