package 문자열내p와y의개수;

public class 풀이 {

    boolean solution(String s){
//        String s2 = s.toLowerCase();
//
//        int p = 0;
//
//        for(char c : s2.toCharArray()) if( c == 'p' ) p++;
//        for(char c : s2.toCharArray()) if( c == 'y' ) p--;
//
//        return p == 0;

        // 정규표현식 활용
        int p =  s.replaceAll("[pP]", "").length();
        int y = s.replaceAll("[yY]", "").length();

        return p == y;
    }
}
