package programmers.level_0;

/**
 * 특정 문자 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120826
 */
public class No_120826 {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}
