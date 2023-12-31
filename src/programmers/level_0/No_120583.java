package programmers.level_0;

/**
 * 중복된 숫자 개수
 * https://school.programmers.co.kr/learn/courses/30/lessons/120583
 */
public class No_120583 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i : array) {
            if(i == n) {
                answer++;
            }
        }

        return answer;
    }
}
