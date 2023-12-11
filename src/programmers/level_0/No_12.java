package programmers.level_0;

/**
 * 배열의 평균값
 */
public class No_12 {
    public double solution(int[] numbers) {
        double answer = 0;

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        answer = (double)sum / numbers.length;

        return answer;
    }
}
