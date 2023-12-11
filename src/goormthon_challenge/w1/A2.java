package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 프로젝트 매니징
 */

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // 입력을 받기 위해 Scanner 객체 생성

        // N 입력 받기
        int N = Integer.parseInt(sc.nextLine());

        // 현재 시간과 분 입력 받기
        String[] time = sc.nextLine().split(" ");
        int currentHour = Integer.parseInt(time[0]);
        int currentMinute = Integer.parseInt(time[1]);

        // 각각의 분만큼 시간에 추가하기
        for (int i = 0; i < N; i++) {
            int costMinute = Integer.parseInt(sc.nextLine());
            int tempMinute = currentMinute + costMinute;
            int resultMinute = tempMinute % 60;
            int resultHour = (currentHour + tempMinute / 60) % 24;
            currentHour = resultHour;
            currentMinute = resultMinute;
        }

        // 결과 출력
        System.out.println(currentHour + " " + currentMinute);
    }
}
