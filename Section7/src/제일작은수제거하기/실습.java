package 제일작은수제거하기;

import java.util.*;

public class 실습 {

    public int[] solution(int[] arr) {

        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();

    }

}
