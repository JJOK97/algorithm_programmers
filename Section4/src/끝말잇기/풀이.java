package 끝말잇기;

import java.util.*;

public class 풀이 {

    public boolean solution(String[] words){

        Set<String> set = new HashSet<>();

        set.add(words[0]);
        char last = words[0].charAt(words[0].length()-1);


        for(int i = 0; i < words.length; i++){
            String w = words[i];

            char first = w.charAt(0);

            if(last != first)return false;

            if(set.add(words[i])) return false;

            last = words[0].charAt(words[i].length()-1);

        }

        return set.size() == words.length;

    }
}
