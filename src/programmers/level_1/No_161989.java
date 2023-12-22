package programmers.level_1;

/**
 * 덧칠하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/161989
 */
public class No_161989 {
    public int solution(int n, int m, int[] section) {
        int answer = 1;

        int x = section[0];
        for (int i = 1; i < section.length; i++) {
            if (x + m <= section[i]) {
                answer++;
                x = section[i];
            }
        }

        return answer;
    }
}
