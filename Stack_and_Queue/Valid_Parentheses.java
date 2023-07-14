package Stack_and_Queue;

import java.util.Stack;

public class Valid_Parentheses {
    public boolean isValid(String s) {
        if(s.length()%2 !=0)
            return  false;
        Stack<Character> stack=new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='('|| c=='{'|| c=='['){
                stack.push(c);
            }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            }
            else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                stack.pop();
            }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
