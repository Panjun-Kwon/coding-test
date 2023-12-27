package programmers.level_1;

/**
 * 부족한 금액 계산하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/82612
 */
public class No_82612 {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long pay = 0;
        for (int i = 1; i <= count; i++) {
            pay += price * i;
            System.out.println("pay = " + pay);
        }

        answer = money - pay > 0 ? 0 : pay - money;

        return answer;
    }
}
