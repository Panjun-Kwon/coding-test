package programmers.level_0;

import java.util.Scanner;

/**
 * [PCCE 기출문제] 3번 / 나이 계산
 * https://school.programmers.co.kr/learn/courses/30/lessons/250131
 */
public class No_250131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        String age_type = sc.next();
        int answer = 0;

        if (age_type.equals("Korea")) {
            answer = 2030 - year + 1;
        }
        else if (age_type.equals("Year")) {
            answer = 2030 - year;
        }

        System.out.println(answer);
    }
}
