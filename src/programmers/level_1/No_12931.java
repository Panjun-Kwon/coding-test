package programmers.level_1;

/**
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */
public class No_12931 {
    public int solution(int n) {
        int answer = 0;

        while (true) {
            answer += n % 10;
            if (n / 10 == 0) {
                break;
            } else {
                n /= 10;
            }
        }

        return answer;
    }
}
