package programmers.level_1;

/**
 * 음양 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/76501
 */
public class No_76501 {
    public int solution(int[] absolutes, boolean[] signs) {
        int sum = 0;

        for (int i = 0; i < absolutes.length; i++) {
            sum += signs[i] == true ? absolutes[i] : (absolutes[i] * -1);
        }

        return sum;
    }

    public int solution2(int[] absolutes, boolean[] signs) {
        int sum = 0;
        for (int i = 0; i < signs.length; i++) {
            sum += signs[i] ? absolutes[i] : -absolutes[i];
        }
        return sum;
    }
}