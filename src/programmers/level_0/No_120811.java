package programmers.level_0;

import java.util.Arrays;

/**
 * 중앙값 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120811
 */
public class No_120811 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        answer = array[array.length / 2];

        return answer;
    }
}
