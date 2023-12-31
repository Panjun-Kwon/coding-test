package programmers.level_0;

/**
 * 배열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120821
 */
public class No_120821 {
    public int[] solution(int[] num_list) {
        int[] answer = {};

        for (int i = 0; i < num_list.length / 2; i++) {
            int tmp = num_list[i];
            num_list[i] = num_list[num_list.length - i - 1];
            num_list[num_list.length - i - 1] = tmp;
        }

        answer = num_list;

        return answer;
    }
}
