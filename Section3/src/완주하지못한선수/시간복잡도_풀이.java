package 완주하지못한선수;

import java.util.Arrays;


public class 시간복잡도_풀이 {
    public String solution(String[] participant, String[] completion){

        // sort의 시간복잡도는 O(nlogn)이기에 Map풀이 O(n)보다 비효율적이다
        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i = 0; i < participant.length; i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        }

        return participant[participant.length - 1];

    }
}
