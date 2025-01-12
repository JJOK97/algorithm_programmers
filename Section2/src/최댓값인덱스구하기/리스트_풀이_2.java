package 최댓값인덱스구하기;

import java.util.*;

public class 리스트_풀이_2 {
    public int[] solution (int[] arr){

        // stream을 활용한 max 구하기
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        // 리스트 만들기
        List<Integer> list = new LinkedList<>();

        // 배열에 인덱스 채우기
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) list.add(i);
        }

        // 리스트를 배열로 변환
        // stream을 활용하여 Array로 변경 가능
        return  list.stream()
                .mapToInt(Integer::intValue) // == mapToInt(i -> i)
                .toArray();

    }

    public static void main(String[] args) {
        실습 solution = new 실습();

        int[] arr1 = {1, 3, 5, 4, 5, 2, 1};
        int[] result1 = solution.solution(arr1);
        System.out.println("Test Case 1: " + Arrays.toString(result1));  // 기대 결과: [2, 4]

        int[] arr2 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};
        int[] result2 = solution.solution(arr2);
        System.out.println("Test Case 2: " + Arrays.toString(result2));  // 기대 결과: [2, 8]
    }
}
