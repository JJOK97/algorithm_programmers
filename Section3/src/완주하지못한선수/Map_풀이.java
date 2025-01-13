package 완주하지못한선수;

import java.util.*;

public class Map_풀이 {
    public String solution(String[] participant, String[] completion){

        // 시간복잡도 O(n)
        Map<String, Integer> players = new HashMap<>();

        for(String p : participant){
            players.put(p, players.getOrDefault(p, 0) + 1);
        }

        for(String c : completion){
            int n = players.get(c) - 1;
            if(n == 0) players.remove(c);
            else players.put(c, n);
        }

        return players.keySet().iterator().next();

    }
}
