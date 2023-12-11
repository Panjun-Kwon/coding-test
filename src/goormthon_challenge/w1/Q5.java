package goormthon_challenge.w1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 이진수 정렬
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
        int N = scanner.nextInt(); // 정렬할 정수의 수
        int K = scanner.nextInt(); // K번째

        ArrayList<Num> a = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int tmp = scanner.nextInt();
            a.add(new Num(tmp, Integer.bitCount(tmp)));
        }

        // 1의 개수에 따라 내림차순
        // 1의 개수가 같을 시 10진수로 내림차순
        Collections.sort(a, Collections.reverseOrder());

        // K번째 정수 출력
        System.out.println(a.get(K-1).getDecimal());
    }
}

class Num implements Comparable<Num> {
    private int decimal;
    private int bitCnt;

    public int getDecimal() {
        return decimal;
    }

    public int getBitCnt() {
        return bitCnt;
    }

    public Num(int decimal, int bitCnt) {
        this.decimal = decimal;
        this.bitCnt = bitCnt;
    }

    @Override
    public int compareTo(Num o) {
        if (bitCnt < o.bitCnt) {
            return -1;
        } else if (bitCnt == o.bitCnt) {
            if(decimal < o.decimal) {
                return -1;
            } else if(decimal == o.decimal) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }
}
