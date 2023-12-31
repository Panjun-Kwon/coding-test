package programmers.level_0;

/**
 * 배열 자르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120833
 */
public class No_120833 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = numbers[i + num1];
        }

        return answer;
    }
}
