package 주식가격;

public class 일반_풀이 {

    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {

            int price = prices[i];
            int seconds = 0;
            for(int j = i + 1; j < prices.length; j++){
                seconds++;
                if(price > prices[j]) break;
            }

            answer[i] = seconds;

        }

        return answer;

    }

}
