package programmers.level_0;

/**
 * 문자 반복 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120825
 */
public class No_120825 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            sb.append(String.valueOf(my_string.charAt(i)).repeat(n));
        }

        return sb.toString();
    }
}
