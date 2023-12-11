package goormthon_challenge.w2;

import java.util.Scanner;

/**
 * 폭탄 구현하기 (2)
 */
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 땅 크기
        int K = scanner.nextInt(); // 폭탄 개수
        scanner.nextLine();

        String[][] map = new String[N][N]; // 땅의 상태
        for (int i = 0; i < N; i++) {
            map[i] = scanner.nextLine().split(" ");
        }

        String[][] bomb = new String[K][2];
        for (int i = 0; i < K; i++) {
            bomb[i] = scanner.nextLine().split(" ");
        }

        int[] dx = {0, 0, 0, 1, -1};
        int[] dy = {0, 1, -1, 0, 0};

        for (int i = 0; i < K; i++) {
            int bombX = Integer.valueOf(bomb[i][0]);
            int bombY = Integer.valueOf(bomb[i][1]);
            for (int j = 0; j < 5; j++) {

            }
        }
    }
}
