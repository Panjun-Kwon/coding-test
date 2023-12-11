package programmers.level_0;

/**
 * 두 수의 나눗셈
 */
public class No_9 {
    public int solution(int num1, int num2) {
        int answer = 0;

        answer = (int)(((double)num1 / num2) * 1000);

        return answer;
    }
}
