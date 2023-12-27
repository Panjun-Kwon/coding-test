package programmers.level_1;

/**
 * 로또의 최고 순위와 최저 순위
 * https://school.programmers.co.kr/learn/courses/30/lessons/77484
 */
public class No_77484 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int cnt = 0;
        int zeroCnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
        }

        answer[0] = 6 - (cnt + zeroCnt) + 1 < 6 ? 6 - (cnt + zeroCnt) + 1 : 6;
        answer[1] = 6 - cnt + 1 < 6 ? 6 - cnt + 1 : 6;

        return answer;
    }
}
