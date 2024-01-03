package programmers.level_0;

/**
 * 정수 부분
 * https://school.programmers.co.kr/learn/courses/30/lessons/181850
 */
public class No_181850 {
    public int solution(double flo) {
        String[] split = String.valueOf(flo).split("\\.");
        return Integer.parseInt(split[0]);
    }
}
