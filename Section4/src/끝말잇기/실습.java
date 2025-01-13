package 끝말잇기;

import java.util.*;

public class 실습 {
    public boolean solution(String[] words) {
        boolean answer = true;

        Set<String> set = new HashSet<>();

        for(int i = 0; i < words.length - 1; i++)
            // 중복되었는지? && 앞, 뒤 글자가 같은지?
            if(!set.contains(words[i]) && words[i].charAt(words[i].length()-1) == words[i+1].charAt(0))
                set.add(words[i]);
            else
                answer = false;

        // 마지막 데이터 유효성 검사
        if(set.contains(words[words.length-1]))
            answer = false;

        return answer;
    }
}
