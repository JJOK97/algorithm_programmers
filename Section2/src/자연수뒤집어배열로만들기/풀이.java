package 자연수뒤집어배열로만들기;

import java.util.*;

public class 풀이 {

    public int[] solution(long n){
        List<Integer> list = new LinkedList<>();

        while(n > 0) {
            int a = (int) (n % 10);
            list.add(a);
            n /= 10;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
