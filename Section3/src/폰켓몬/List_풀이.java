package 폰켓몬;

import java.util.LinkedList;
import java.util.List;

public class List_풀이 {

    public int solution(int[] nums){

        // 포켓몬의 종류의 개수를 구한다.
        List<Integer> list = new LinkedList<>();

        // contains로 확인이 가능하나, list의 contains는 탐색을 하기 때문에, Map에 비해 비효율적이다.
        for(int n : nums){
            if(!list.contains(n)) list.add(n);
        }

        int n1 = list.size();

        // 배열 크기의 1/2을 구한다.
        int n2 = nums.length / 2;

        // 최솟값을 선택한다.
        return Math.min(n1, n2);

    }

}
