package 문자열내마음대로정렬하기;

import java.util.*;

class 실습 {
    public String[] solution(String[] strings, int n) {
        // 정렬을 위해 ArrayList로 변환
        List<String> list = new ArrayList<>(Arrays.asList(strings));

        // Custom Comparator 사용
        list.sort(new Sort(n));

        // List를 다시 배열로 변환하여 반환
        return list.toArray(new String[0]);
    }
}

class Sort implements Comparator<String> {
    private int index;

    public Sort(int index) {
        this.index = index;
    }

    @Override
    public int compare(String o1, String o2) {
        char c1 = o1.charAt(index);
        char c2 = o2.charAt(index);

        if (c1 == c2) {
            // n번째 글자가 같다면 사전순으로 정렬
            return o1.compareTo(o2);
        }
        return Character.compare(c1, c2); // n번째 글자를 기준으로 정렬
    }
}