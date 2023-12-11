package programmers.level_0;

/**
 * 특정 문자 제거하기
 */
public class No_22 {
    public String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replace(letter, "");

        return answer;
    }
}
