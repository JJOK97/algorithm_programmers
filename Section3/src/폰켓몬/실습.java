package 폰켓몬;

import java.util.*;

public class 실습 {
    public int solution(int[] nums) {

        // 문제 이해가 조금 어려웠음
        int MAX = nums.length/2;

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return Math.min(map.size(), MAX);

    }
}
