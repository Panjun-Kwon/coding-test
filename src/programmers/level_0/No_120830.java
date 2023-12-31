package programmers.level_0;

/**
 * 양꼬치
 * https://school.programmers.co.kr/learn/courses/30/lessons/120830
 */
public class No_120830 {
    public int solution(int n, int k) {
        int answer = 0;

        answer = 12000 * n + 2000 * (k - n/10);

        return answer;
    }
}
