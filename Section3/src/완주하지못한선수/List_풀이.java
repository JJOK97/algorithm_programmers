package 완주하지못한선수;

import java.util.LinkedList;
import java.util.List;

public class List_풀이 {
    public String solution(String[] participant, String[] completion){

        List<String> players = new LinkedList<>();
        for(String p : participant) players.add(p);

        // 시간초과 발생, 찾아내는 탐색 과정에서 비효율 발생
        for(String c : completion) players.remove(c);

        return players.get(0);

    }
}
