package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 운동 중독 플레이어
 */
public class A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위해 Scanner 객체 생성

        // 두 숫자를 입력 받기
        int W = sc.nextInt();
        int R = sc.nextInt();

        // 연산 실행 후 결과 출력
        System.out.println((int)(W * (1 + (double)R / 30)));
    }
}
