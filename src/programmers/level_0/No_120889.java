package programmers.level_0;

import java.util.Arrays;

/**
 * 삼각형의 완성조건 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120889
 */
public class No_120889 {
    public int solution(int[] sides) {
        int answer = 0;

        Arrays.sort(sides);
        if(sides[2] < sides[0] + sides[1]) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
