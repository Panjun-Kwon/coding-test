package programmers.level_0;

/**
 * 짝수 홀수 개수
 */
public class No_23 {
    public int[] solution(int[] num_list) {
        int[] answer = {0, 0};

        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }

        return answer;
    }
}
