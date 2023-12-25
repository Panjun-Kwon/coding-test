package programmers.level_1;

import java.util.Arrays;

/**
 * 최소직사각형
 * https://school.programmers.co.kr/learn/courses/30/lessons/86491
 */
public class No_86491 {
    public int solution(int[][] sizes) {
        int[] w = new int[sizes.length];
        int[] h = new int[sizes.length];
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                w[i] = sizes[i][0];
                h[i] = sizes[i][1];
            } else {
                w[i] = sizes[i][1];
                h[i] = sizes[i][0];
            }
        }
        int wMax = Arrays.stream(w).max().orElse(0);
        int hMax = Arrays.stream(h).max().orElse(0);

        return wMax * hMax;
    }
}
