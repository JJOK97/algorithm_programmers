package 스킬트리;

import java.util.*;

public class 풀이 {

    public int solution(String skill, String[] skill_trees){

        int answer = 0;

        for(String s : skill_trees){
            String s2 = s.replaceAll("["+skill+"]","");
            if(skill.startsWith(s2)) answer++;
        }

        return answer;
    }

}
