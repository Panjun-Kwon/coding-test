package programmers.level_0;

/**
 * 짝수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/120831
 */
public class No_120831 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if(i%2 == 0) {
                answer += i;
            }
        }

        return answer;
    }
}
