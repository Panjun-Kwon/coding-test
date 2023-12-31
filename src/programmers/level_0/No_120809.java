package programmers.level_0;

/**
 * 배열 두배 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 */
public class No_120809 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            answer[i] = numbers[i] * 2;
        }

        return answer;
    }
}
