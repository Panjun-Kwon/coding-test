package programmers.level_0;

/**
 * 옷가게 할인 받기
 */
public class No_31 {
     public int solution(int price) {
        int answer = 0;

        double discount;
        if (price >= 100000 && price < 300000) {
            discount = 0.05;
        } else if (price >= 300000 && price < 500000) {
            discount = 0.1;
        } else if (price >= 500000) {
            discount = 0.2;
        } else {
            discount = 0;
        }

        answer = (int) (price * (1 - discount));

        return answer;
    }
}
