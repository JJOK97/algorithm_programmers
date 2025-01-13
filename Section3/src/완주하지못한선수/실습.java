package 완주하지못한선수;

import java.util.*;

public class 실습 {

        public String solution(String[] participant, String[] completion) {

            Map<String, Integer> map = new HashMap<>();

            // 참여자를 map에 넣고, 호출 된사람 제거
            for (String part : participant)
                map.put(part, map.getOrDefault(part, 0) + 1);

            for (String comp : completion)
                map.put(comp, map.get(comp) - 1);

            // value가 1인 key 호출
            String answer = "";

            for (String key : map.keySet()) {
                if (map.get(key) == 1) {
                    answer = key;
                    break;
                }
            }

            return answer;

        }

}
