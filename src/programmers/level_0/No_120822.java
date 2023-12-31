package programmers.level_0;

import java.util.Arrays;

/**
 * 문자열 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120822
 */
public class No_120822 {
    public String solution(String my_string) {
        String answer = "";

        String[] str = my_string.split("");
        for (int i = 0; i < str.length / 2; i++) {
            String tmp = str[i];
            str[i] = str[str.length - i - 1];
            str[str.length - i -1] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        Arrays.stream(str).forEach(s -> {
            sb.append(s);
        });
        answer = sb.toString();

        return answer;
    }
}
