package programmers.level_1;

/**
 * 가장 가까운 같은 글자
 * https://school.programmers.co.kr/learn/courses/30/lessons/142086
 */
public class No_142086 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int pos = s.substring(0, i).lastIndexOf(String.valueOf(s.charAt(i)));
            if (pos == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - pos;
            }
        }

        return answer;
    }
}
