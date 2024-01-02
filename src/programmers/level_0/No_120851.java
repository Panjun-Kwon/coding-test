package programmers.level_0;

/**
 * 숨어있는 숫자의 덧셈 (1)
 * https://school.programmers.co.kr/learn/courses/30/lessons/120851
 */
public class No_120851 {
    public static void main(String[] args) {
        new No_120851().solution("aAb1B2cC34oOp");
    }
    public int solution(String my_string) {
        int sum = 0;
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Integer.valueOf(String.valueOf(ch));
            }
        }

        return sum;
    }
}
