package programmers.level_0;

/**
 * 분수의 덧셈
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 */
public class No_120808 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        numer1 *= denom2;
        numer2 *= denom1;

        int son = numer1 + numer2;
        int mom = denom1 * denom2;

        int v = son < mom ? son : mom;
        for (int i = v; i > 0; i--) {
            if (son % i == 0 && mom % i == 0) {
                son /= i;
                mom /= i;
                break;
            }
        }

        return new int[] {son, mom};
    }
}
