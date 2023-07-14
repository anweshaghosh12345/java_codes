package Stack_and_Queue;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {
    public int evalRPN(String[] tokens){
        Stack<Integer> stack=new Stack<>();
        int i=1;
        stack.push(Integer.parseInt(tokens[0]));
        while (!(stack.isEmpty())&& i<tokens.length){
            String str=(tokens[i++]);

            if(str.equals("+")||str.equals("-")|| str.equals("*")||str.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                if(str.equals("+"))
                    a+=b;
                if(str.equals("-"))
                    a-=b;
                if(str.equals("*"))
                    a*=b;
                 if(str.equals("/"))
                    a/=b;
                stack.push(a);
            }
            else {
                stack.push(Integer.parseInt(String.valueOf(str)));
            }
        }
        return stack.pop();
    }
}
