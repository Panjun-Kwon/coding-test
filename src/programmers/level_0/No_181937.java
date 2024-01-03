package programmers.level_0;

/**
 * n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */
public class No_181937 {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}