package programmers.level_0;

/**
 * [PCCE 기출문제] 6번 / 가채점
 * https://school.programmers.co.kr/learn/courses/30/lessons/250128
 */
public class No_250128 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
