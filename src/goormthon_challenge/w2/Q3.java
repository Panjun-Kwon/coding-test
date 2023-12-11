package goormthon_challenge.w2;

import java.util.Scanner;

/**
 * 통증
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 통증 크기

        int bandage = 1;
        int medicine = 7;
        int painkiller = 14;

        int cnt = 0;
        cnt += N / painkiller;
        N %= painkiller;

        cnt += N / medicine;
        N %= medicine;

        cnt += N / bandage;
        N %= bandage;

        System.out.println(cnt);
    }
}
