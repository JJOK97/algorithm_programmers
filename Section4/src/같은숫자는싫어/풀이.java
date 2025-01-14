package 같은숫자는싫어;

import java.util.*;

public class 풀이 {
    public int[] solution(int[] arr){

        List<Integer> list = new LinkedList<>();

        int last = -1;
        for(int a : arr){
            if(last == a) continue;
            last = a;
            list.add(last);
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}
