package programmers.level_0;

/**
 * 피자 나눠 먹기 (1)
 */
public class No_18 {
    public int solution(int n) {
        int answer = 0;

        answer = (int)Math.ceil((double)n / 7);

        return answer;
    }
}
