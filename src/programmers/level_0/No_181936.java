package programmers.level_0;

/**
 * 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */
public class No_181936 {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
