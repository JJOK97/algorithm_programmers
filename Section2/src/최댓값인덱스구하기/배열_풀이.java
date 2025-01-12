package 최댓값인덱스구하기;

public class 배열_풀이 {
    public int[] solution (int[] arr){

        // 최댓값 구하기
        int max = 0;
        for(int a : arr) if(a > max) max = a;

        // 최댓값이 몇개인지 확인하기
        int count = 0;
        for(int a : arr) if(a == max) count++;

        // 배열 만들기
        int[] answer = new int[count];

        // 배열에 인덱스 채우기
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) answer[index++] = i;
        }

        return answer;
    }
}
