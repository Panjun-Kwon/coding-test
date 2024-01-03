package programmers.level_0;

/**
 * 더 크게 합치기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */
public class No_181939 {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
    }
}
