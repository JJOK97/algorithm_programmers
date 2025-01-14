package 기능개발;

import java.util.*;

public class 실습 {

    public int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> pro = new LinkedList<>();
        Queue<Integer> speed = new LinkedList<>();

        List<Integer> answer = new LinkedList<>();

        for(int p : progresses) pro.offer(p);
        for(int s : speeds) speed.offer(s);

        int day = 0;
        int n = progresses.length;

        while(!pro.isEmpty()){

            day = (int) Math.ceil((100.0 - pro.poll()) / speed.poll());

            int count = 1;

            while(!pro.isEmpty()){

                int now = (int) Math.ceil((100.0 - pro.peek()) / speed.peek());

                if(now <= day) {
                    pro.poll();
                    speed.poll();
                    count++;
                } else {
                    break;
                }

            }

            answer.add(count);

        }

        return answer.stream().mapToInt(i -> i).toArray();
    }

}
