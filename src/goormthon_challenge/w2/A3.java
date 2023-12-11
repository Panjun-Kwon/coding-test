package goormthon_challenge.w2;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        int ans = 0;
        int[] painKiller = {14, 7, 1};
        for (int i : painKiller) {
            ans += N / i;
            N %= i;
        }
        System.out.println(ans);
    }
}
