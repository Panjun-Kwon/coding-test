package goormthon_challenge.week1;

import java.util.Scanner;

/**
 * 운동 중독 플레이어
 */
public class No_2003298 {
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

class Answer_2003298 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위해 Scanner 객체 생성

        // 두 숫자를 입력 받기
        int W = sc.nextInt();
        int R = sc.nextInt();

        // 연산 실행 후 결과 출력
        System.out.println((int)(W * (1 + (double)R / 30)));
    }
}
