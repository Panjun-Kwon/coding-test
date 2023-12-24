package programmers.level_1;

/**
 * 콜라 문제
 * https://school.programmers.co.kr/learn/courses/30/lessons/132267
 */
public class No_132267 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            answer += (n / a) * b;
            n = (n / a) * b + (n % a);
        }

        return answer;
    }
}
