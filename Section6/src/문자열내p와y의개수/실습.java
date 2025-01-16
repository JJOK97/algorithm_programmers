package 문자열내p와y의개수;

public class 실습 {

    class Solution {
        boolean solution(String s) {
            boolean answer = true;

            int Y = 0;
            int P = 0;

            for(char c : s.toCharArray()){

                if (c == 'Y' || c == 'y') Y++;
                else if (c == 'P' || c == 'p') P++;

            }

            if(Y != P) return false;

            return answer;
        }
    }

}
