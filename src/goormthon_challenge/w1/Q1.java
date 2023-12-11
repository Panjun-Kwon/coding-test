package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 운동 중독 플레이어
 */
public class Q1 {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt(); // 무게
        int R = scanner.nextInt(); // 반복 횟수

        // 1RM 계산
        int RM = (int) (W * (1 + R/30.0));
//        int RM = (int) (W * (1 + (double)(R/30))); wrong

        // 1RM 출력
        System.out.println(RM);
    }
}
