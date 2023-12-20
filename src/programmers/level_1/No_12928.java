package programmers.level_1;

/**
 * 약수의 합
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 */
public class No_12928 {
    public int solution(int n) {
        int sum = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                sum += i;
                if(i != n/i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
