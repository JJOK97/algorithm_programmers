package 최댓값인덱스구하기;

import java.util.*;

public class 리스트_풀이 {
    public int[] solution (int[] arr){

        // 최댓값 구하기
        int max = 0;
        for(int a : arr) if(a > max) max = a;

        // 리스트 만들기
        List<Integer> list = new LinkedList<>();

        // 배열에 인덱스 채우기
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) list.add(i);
        }

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;

    }
}
