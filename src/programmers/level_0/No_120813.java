package programmers.level_0;

/**
 * 짝수는 싫어요
 * https://school.programmers.co.kr/learn/courses/30/lessons/120813
 */
public class No_120813 {
    public int[] solution(int n) {
        int[] answer;
        if(n % 2 == 0) {
            answer = new int[n / 2];
        } else {
            answer = new int[n / 2 + 1];
        }


        int j = 0;
        for (int i = 0; i <= n; i++) {
            if(i % 2 == 1) {
                answer[j++] = i;
            }
        }

        return answer;
    }
}
