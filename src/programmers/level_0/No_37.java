package programmers.level_0;

import java.util.ArrayList;
import java.util.List;

/**
 * 분수의 덧셈
 */
public class No_37 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        numer1 *= denom2;
        numer2 *= denom1;

        int numer = numer1 + numer2;
        int denom = denom1 * denom2;

        List<Integer> numerD = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(numer); i++) {
            if(numer % i == 0) {
                numerD.add(i);
            }
        }

        List<Integer> denomD = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(denom); i++) {
            if(denom % i == 0) {
                denomD.add(i);
            }
        }

        return answer;
    }
}
