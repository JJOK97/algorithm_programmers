package 올바른괄호;

import java.util.Stack;

public class Stack_풀이 {

    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(') stack.push(c);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty() == true;

    }


}
