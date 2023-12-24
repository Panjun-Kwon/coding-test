package programmers.level_1;

/**
 * 푸드 파이트 대회
 * https://school.programmers.co.kr/learn/courses/30/lessons/134240
 */
public class No_134240 {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        String first = sb.toString();
        String second = sb.reverse().toString();

        return first + "0" + second;
    }
}
