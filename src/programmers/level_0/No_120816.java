package programmers.level_0;

/**
 * 피자 나눠 먹기 (3)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120816
 */
public class No_120816 {
    public int solution(int slice, int n) {
        int answer = 0;

        answer = (int)Math.ceil((double)n / slice);

        return answer;
    }
}
