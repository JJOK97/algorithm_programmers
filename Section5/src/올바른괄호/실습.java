package 올바른괄호;

import java.util.Stack;

public class 실습 {

    boolean solution(String s) {

        boolean answer = true;

        // Stack에 괄호 입력
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++)
            stack.push(s.charAt(i));

        // 괄호 check
        int check = 0;
        for(int i = 0; i < s.length(); i++){

            if(stack.peek() == ')'){

                stack.pop();
                check++;

            } else {

                if(check == 0){
                    return false;
                } else {

                    stack.pop();
                    check--;

                }

            }
        }

        // 전체 탐색했을때 총합 0이 아니면 false
        if(check != 0) return false;

        return answer;

    }

}
