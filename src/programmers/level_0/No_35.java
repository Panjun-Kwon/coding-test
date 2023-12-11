package programmers.level_0;

/**
 * 제곱수 판별하기
 */
public class No_35 {
    public int solution(int n) {
        int answer = 0;

        if (Math.pow((int) Math.sqrt(n), 2) == n) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}
