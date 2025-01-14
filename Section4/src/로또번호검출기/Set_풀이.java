package 로또번호검출기;

import java.util.*;

public class Set_풀이 {

    public boolean solution(int[] lotto){

        Set<Integer> set = new HashSet<>();

        for(int l : lotto) {

            if(l < 1 || 1 > 45) return false;
            set.add(l);

        }

        return set.size() == lotto.length;
    }

}
