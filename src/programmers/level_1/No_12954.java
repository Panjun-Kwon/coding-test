package programmers.level_1;

/**
 * x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class No_12954 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = x * (long) (i + 1);
        }

        return answer;
    }
}
