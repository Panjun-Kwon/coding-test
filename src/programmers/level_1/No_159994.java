package programmers.level_1;

/**
 * 카드 뭉치
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994
 */
public class No_159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0;
        int idx2 = 0;

        for (int i = 0; i < goal.length; i++) {
            if(idx1 < cards1.length && cards1[idx1].equals(goal[i])) {
                idx1++;
            } else if(idx2 < cards2.length && cards2[idx2].equals(goal[i])) {
                idx2++;
            }
        }

        if (idx1 + idx2 == goal.length) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
