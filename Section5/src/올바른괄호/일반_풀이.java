package 올바른괄호;

public class 일반_풀이 {

    boolean solution(String s) {

        int stack = 0;

        for(char c : s.toCharArray()){
            if(c == '(') stack++;
            else {
                if(stack == 0) return false;
                stack--;
            }
        }

        return stack == 0;

    }

}
