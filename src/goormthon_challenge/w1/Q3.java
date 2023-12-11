package goormthon_challenge.w1;

import java.util.Scanner;

/**
 * 합 계산기
 */
public class Q3 {
    public static void main(String[] args) {
        // 입력
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 식의 개수
        scanner.nextLine(); // 공백 제거

        int result = 0; // 모든 계삭식의 합
        for (int i = 0; i < T; i++) {
            String[] formula = scanner.nextLine().split(" ");

            int op1 = Integer.parseInt(formula[0]);
            int op2 = Integer.parseInt(formula[2]);
            switch (formula[1]) { // 각 계산식 계산
                case "+" :
                    result += op1 + op2;
                    break;
                case "-" :
                    result += op1 - op2;
                    break;
                case "*" :
                    result += op1 * op2;
                    break;
                case "/" :
                    result += op1 / op2;
                    break;
            }
        }

        System.out.println(result);
    }
}
