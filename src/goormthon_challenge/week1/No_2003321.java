package goormthon_challenge.week1;

import java.util.Scanner;

/**
 * 합 계산기
 */
public class No_2003321 {
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

class Answer_2003321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        int result = 0;
        for (int i = 0; i < T; i++) {
            String[] strArr = sc.nextLine().split(" ");
            int firstNum = Integer.parseInt(strArr[0]);
            String command = strArr[1];
            int secondNum = Integer.parseInt(strArr[2]);
            if (command.equals("+")) result += (firstNum + secondNum);
            else if (command.equals("-")) result += (firstNum - secondNum);
            else if (command.equals("*")) result += (firstNum * secondNum);
            else result += (firstNum / secondNum);
        }

        System.out.println(result);
    }
}
