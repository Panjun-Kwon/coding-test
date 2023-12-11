package programmers.level_0;

import java.util.Arrays;

/**
 * 머쓱이보다 키 큰 사람
 */
public class No_20 {
    public int solution(int[] array, int height) {
        int answer = 0;

        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i] > height) {
                answer++;
            }
        }

        return answer;
    }
}
