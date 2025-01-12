package 최댓값인덱스구하기;

import java.util.*;

public class 실습 {
    public int[] solution(int[] arr) {


        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            max = max > arr[i] ? max : arr[i];
        }

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) list.add(i);
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;

    }

//    public static void main(String[] args) {
//        실습 solution = new 실습();
//
//        int[] arr1 = {1, 3, 5, 4, 5, 2, 1};
//        int[] result1 = solution.solution(arr1);
//        System.out.println("Test Case 1: " + Arrays.toString(result1));  // 기대 결과: [2, 4]
//
//        int[] arr2 = {3, 6, 10, 1, 7, 2, 4, 6, 10, 9};
//        int[] result2 = solution.solution(arr2);
//        System.out.println("Test Case 2: " + Arrays.toString(result2));  // 기대 결과: [2, 8]
//    }
}
