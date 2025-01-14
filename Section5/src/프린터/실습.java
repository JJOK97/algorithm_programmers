package 프린터;

import java.util.*;

class 실습 {
    public int solution(int[] priorities, int location) {

        Queue<int[]> queue = new LinkedList<>();

        int index = priorities.length;
        for(int i = 0; i < index; i++)
            queue.add(new int[]{priorities[i], i});

        int answer = 0;

        while(!queue.isEmpty()){

            // 다른 데이터 비교
            int[] current = queue.poll();
            boolean check = false;

            for(int[] q : queue)
                if(q[0] > current[0]){
                    check = true;
                    break;
                }

            // 우선순위가 높은 값이 앞에오도록
            if(check){
                queue.offer(current);

                // 우선순위가 고정이 되었으면 원하는 값 찾기
            } else {
                answer++;
                if(current[1] == location){
                    return answer;
                }
            }

        }

        return answer;
    }
}