package 위장;

import java.util.HashMap;
import java.util.Map;

public class Map_풀이 {

    public int solution(String[][] cloths){
        // [["yellowhat", "headgear"],
        // ["bluesunglasses", "eyewear],
        // ["green_turban", "headgear"]]

        // headgear : 2 -> 3
        // eyewear : 1 - > 2
        // 3 * 2 == 6
        // 하나는 입어야 한다고 하니 -1

        // 위장 용품의 종류 별 개수를 구한다.
        Map<String, Integer> map = new HashMap<>();

        for(String[] c : cloths){
            String type = c[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        // 각 개수의 +1을 모두 곱한다.
        int answer = 1;
        var iter = map.values().iterator();
        while(iter.hasNext()){
            answer *= iter.next() + 1;
        }

        // -1을 해서 리턴한다.
        return answer - 1;
    }
}
