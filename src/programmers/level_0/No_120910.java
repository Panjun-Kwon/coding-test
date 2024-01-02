package programmers.level_0;

/**
 * 세균 증식
 * https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */
public class No_120910 {
    public int solution(int n, int t) {
        for (int i = 0; i < t; i++) {
            n *= 2;
            System.out.println(n);
        }

        return n;
    }
}
