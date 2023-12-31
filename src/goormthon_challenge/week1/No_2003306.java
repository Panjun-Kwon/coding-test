package goormthon_challenge.week1;

import java.util.Scanner;

/**
 * 프로젝트 매니징
 */
public class No_2003306 {
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

class Answer_2003306 {
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
