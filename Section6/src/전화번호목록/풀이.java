package 전화번호목록;

import java.util.*;

public class 풀이 {

    public boolean solution(String[] phone_book){

        Arrays.sort(phone_book);

        for(int i = 1; i < phone_book.length; i++){
            if(phone_book[i].startsWith(phone_book[i-1])) return false;
        }

        return true;

    }
}
