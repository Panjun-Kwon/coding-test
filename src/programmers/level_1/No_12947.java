package programmers.level_1;

/**
 * 하샤드 수
 * https://school.programmers.co.kr/learn/courses/30/lessons/12947
 */
public class No_12947 {
    public boolean solution(int x) {
        String[] xArr = String.valueOf(x).split("");

        int sumArr = 0;
        for (String n : xArr) {
            sumArr += Integer.valueOf(n);
        }

        return x % sumArr == 0;
    }
}
