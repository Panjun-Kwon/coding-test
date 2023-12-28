package programmers.level_1;

/**
 * 내적
 * https://school.programmers.co.kr/learn/courses/30/lessons/70128
 */
public class No_70128 {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }

        return answer;
    }
}
