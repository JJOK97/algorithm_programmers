package 프린터;

import java.util.LinkedList;
import java.util.List;

public class 풀이 {

    class Paper{
        boolean isMine;
        int priority;
        Paper(int p, boolean m) { priority = p; isMine = m; };
    }

    public int solution(int[] priorities, int locaion){

        // [(1), 1, 9, 1, 1, 1]

        // 정렬
        // [9, 1, 1, 1, (1), 1] -> 9 출력
        // [1, 1, 1, (1), 1] -> 다음 index가 우선순위가 가장높은지 파악, 없으면 출력
        // ...

        List<Paper> queue = new LinkedList<>();

        for(int i = 0; i < priorities.length; i++){
            queue.add(new Paper(priorities[i], i == locaion));
        }
        int answer = 0;

        while(!queue.isEmpty()) {
            Paper now = queue.remove(0);
            boolean printable = false;
            for (Paper p : queue) {
                if (now.priority < p.priority) {
                    printable = false;
                    break;
                }
            }

            if (!printable) {
                queue.add(now);
                continue;
            }

            answer++;
            if(now.isMine) return answer;

        }

        return answer;

    }

}
