package programmers.level_0;

/**
 * 숫자 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120807
 */
public class No_120807 {
    public int solution(int num1, int num2) {
        int answer = 0;

        if(num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}
