package programmers.level_0;

import java.util.ArrayList;

/**
 * 모음 제거
 * https://school.programmers.co.kr/learn/courses/30/lessons/120849
 */
public class No_120849 {
    public String solution(String my_string) {
        String vowels = "aeiou";

        for (int i = 0; i < vowels.length(); i++) {
            char ch = vowels.charAt(i);
            if (my_string.contains(String.valueOf(ch))) {
                my_string = my_string.replaceAll(String.valueOf(ch), "");
            }
        }

        return my_string;
    }
}
