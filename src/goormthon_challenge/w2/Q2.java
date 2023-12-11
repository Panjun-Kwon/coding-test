package goormthon_challenge.w2;

import java.util.Scanner;

/**
 * 구름 찾기 깃발
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 게임판의 크기
        int K = scanner.nextInt(); // 깃발의 값

        int[][] M = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                M[i][j] = scanner.nextInt();
            }
        }

        int[] dx = {0, 0, 1, 1, 1, -1, -1, -1};
        int[] dy = {1, -1, 1, 0, -1, 1, 0, -1};

        int[][] M2 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(M[i][j] == 0) { // 0일때 8방향 탐색
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if(nx >= 0 && nx < N && ny >= 0 && ny < N) {
                            if(M[nx][ny] == 1) {
                                cnt++;
                            }
                        }
                    }
                    M2[i][j] = cnt;
                }
            }
        }

        // 깃발의 값 개수 출력하기
        int Kcnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(M2[i][j] == K) {
                    Kcnt++;
                }
            }
        }

        System.out.println(Kcnt);
    }
}
