package 스킬트리;

class 실습 {
    public int solution(String skill, String[] skill_trees) {
        int count = 0;

        for (String skillTree : skill_trees) {
            if (check(skill, skillTree)) {
                count++;
            }
        }

        return count;
    }

    private boolean check(String skill, String skillTree) {
        int index = 0;

        for (char c : skillTree.toCharArray()) {
            if (skill.indexOf(c) != -1) {
                if (skill.indexOf(c) != index) {
                    return false;
                }
                index++;
            }
        }

        return true;
    }
}
