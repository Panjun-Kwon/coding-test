package programmers.level_0;

import java.util.Arrays;

/**
 * 중앙값 구하기
 */
public class No_32 {
    public int solution(int[] array) {
        int answer = 0;

        Arrays.sort(array);
        answer = array[array.length / 2];

        return answer;
    }
}
