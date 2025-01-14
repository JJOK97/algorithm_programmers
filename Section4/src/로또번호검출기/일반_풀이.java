package 로또번호검출기;

public class 일반_풀이 {

    public boolean solution(int[] lotto){

        boolean[] checker = new boolean[45 + 1];

        for(int l : lotto) {
            if(l < 1 || 1 > 45) return false;
            if(checker[l] == true) return false;
            checker[l] = true;
        }

        return true;
    }

}
