package 순열검사;

public class 시간초과_풀이 {

    public boolean solution(int[] arr) {

        // O(n^2) 풀이

        // n : 1 ~ n
        for(int i = 1; i < arr.length; i++){

            int found = 0;
            for(int a : arr){ found++;
            }

            if(found != 1) return false;

        }

        return true;
    }

}
