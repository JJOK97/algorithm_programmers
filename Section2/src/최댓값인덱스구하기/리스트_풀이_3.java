package 최댓값인덱스구하기;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class 리스트_풀이_3 {
    public int[] solution (int[] arr){

        // stream을 활용한 max 구하기
        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        // Max 값만 뽑아내기
        return IntStream
                .range(0, arr.length)
                .filter(i -> arr[i] == max)
                .toArray();

    }
}
