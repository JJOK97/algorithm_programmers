package 순열검사;

import java.util.*;

public class 실습 {

    public boolean solution(int[] arr){

        Arrays.sort(arr);

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != i + 1) return false;

        }

        return true;

    }

    public static void main(String[] args){
        실습 solution = new 실습();

        int[] arr1 = new int[]{4, 1, 3, 2};
        boolean result1 = solution.solution(arr1);
        System.out.println("result1 = " + result1);

        int[] arr2 = new int[]{4, 1, 3};
        boolean result2 = solution.solution(arr2);
        System.out.println("result2 = " + result2);

    }
}
