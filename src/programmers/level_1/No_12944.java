package programmers.level_1;

/**
 * 평균 구하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 */
public class No_12944 {
    public double solution(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double) sum / arr.length;
    }
}
