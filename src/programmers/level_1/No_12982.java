package programmers.level_1;

import java.util.Arrays;

/**
 * 예산
 * https://school.programmers.co.kr/learn/courses/30/lessons/12982
 */
public class No_12982 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int idx = 0;
        int sum = 0;
        while (idx < d.length) {
            sum += d[idx++];
            if (sum > budget) {
                break;
            }
            answer++;
        }

        return answer;
    }
}
