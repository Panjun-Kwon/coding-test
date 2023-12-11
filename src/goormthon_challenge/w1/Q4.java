package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 완벽한 햄버거 만들기
 */
public class Q4 {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 재료의 개수

        int[] k = new int[N]; // 각 재료의 맛
        for (int i = 0; i < N; i++) {
            k[i] = scanner.nextInt();
        }

        int result = 0; // 햄버거의 맛
        boolean flag = true;
        for (int i = 0; i < N; i++) {
            result += k[i];

            if(i == 0) {
                continue;
            }

            if(flag) { // 햄버거 검증
                if(k[i-1] > k[i]) {
                    flag = false;
                }
            } else {
                if(k[i-1] < k[i]) {
                    System.out.println(0);
                    return;
                }
            }
        }

        System.out.println(result);
    }
}
