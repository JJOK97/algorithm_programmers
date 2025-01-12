package 자연수뒤집어배열로만들기;

import java.util.*;

public class 실습 {
    public int[] solution(long arr){

        List<Integer> list = new ArrayList<>();
        while(arr > 0) {
            list.add((int)(arr % 10));
            arr /= 10;
        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}
