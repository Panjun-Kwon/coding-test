package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 프로젝트 매니징
 */
public class Q2 {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 기능 N개
        int T = scanner.nextInt(); // T시
        int M = scanner.nextInt(); // M분
        int[] c = new int[N]; // N개의 기능의 각 소요 시간
        for (int i = 0; i < N; i++) {
            c[i] = scanner.nextInt();
        }

        // N개의 기능의 총 소요 시간 계산
        int total = 0;
        for (int i = 0; i < c.length; i++) {
            total += c[i];
        }

        // T시 M분에 더함
        int t = total / 60; // 시간
        int m = total % 60; // 분

        M += m;
        if (M >= 60) {
            T += M/60;
            M %= 60;
        }

        T += t;
        if (T >= 24) {
            T %= 24;
        }

        // 출력
        System.out.println(T + " " + M);
    }
}
