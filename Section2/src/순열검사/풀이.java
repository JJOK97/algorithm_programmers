package 순열검사;

import java.util.*;

public class 풀이 {
    public boolean solution(int[] arr){

        // 전체 O(nlogn)
        int[] answer = new int[arr.length];

        // O(n)
        for(int i = 0; i < arr.length; i++) answer[i] = i + 1;

        // O(nlogn)
        Arrays.sort(arr);

        // 1부터 length까지 값과 arr을 정렬한게 같은지?
        return Arrays.equals(answer, arr); // O(n)
    }
}
