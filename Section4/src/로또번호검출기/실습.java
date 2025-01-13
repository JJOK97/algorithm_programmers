package 로또번호검출기;

import java.util.*;

public class 실습 {
    public boolean solution(int[] lotto) {
        boolean answer = true;

        Set<Integer> set = new HashSet<>(6);

        for(int l : lotto)
            if(!set.contains(l))
                set.add(l);
            else
                return false;

        return answer;
    }
}
