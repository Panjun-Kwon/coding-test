package programmers.level_1;

/**
 * 문자열 내 p와 y의 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 */
public class No_12916 {
    boolean solution(String s) {

        String lower = s.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;
        for (int i = 0; i < lower.length(); i++) {
            if (lower.charAt(i) == 'p') {
                pCnt++;
            } else if (lower.charAt(i) == 'y') {
                yCnt++;
            }
        }

        if (pCnt == yCnt) {
            return true;
        } else {
            return false;
        }
    }
}
