package programmers.level_1;

/**
 * 기사단원의 무기
 * https://school.programmers.co.kr/learn/courses/30/lessons/136798
 */
public class No_136798 {
    public int solution(int number, int limit, int power) {
        int result = 0;

        for (int i = 1; i <= number; i++) {
            int p = 0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    if (i / j == j) {
                        p++;
                    } else {
                        p += 2;
                    }
                }
            }
            if (p > limit) {
                result += power;
            } else {
                result += p;
            }
        }

        return result;
    }
}
