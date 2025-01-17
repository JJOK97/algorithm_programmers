package 스킬트리;

import java.util.Arrays;

public class Stream_풀이 {

    public int solution(String skill, String[] skill_trees){

        return (int) Arrays.stream(skill_trees)
                .map(s -> s.replaceAll("["+skill+"]", ""))
                .filter(s -> skill.startsWith(s))
                .count();

    }

}
