package programmers.level_0;

/**
 * 피자 나눠 먹기 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120814
 */
public class No_120814 {
    public int solution(int n) {
        int answer = 0;

        answer = (int)Math.ceil((double)n / 7);

        return answer;
    }
}
