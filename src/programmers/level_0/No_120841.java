package programmers.level_0;

/**
 * 점의 위치 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120841
 */
public class No_120841 {
    public int solution(int[] dot) {
        int answer = 0;

        for (int i = 0; i < dot.length; i++) {
            if(dot[0] < 0) {
                if(dot[1] < 0) {
                    answer = 3;
                } else {
                    answer = 2;
                }
            } else {
                if(dot[1] < 0) {
                    answer = 4;
                } else {
                    answer = 1;
                }
            }
        }

        return answer;
    }
}
