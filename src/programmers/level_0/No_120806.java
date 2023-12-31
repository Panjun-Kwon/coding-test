package programmers.level_0;

/**
 * 두 수의 나눗셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 */
public class No_120806 {
    public int solution(int num1, int num2) {
        int answer = 0;

        answer = (int)(((double)num1 / num2) * 1000);

        return answer;
    }
}
