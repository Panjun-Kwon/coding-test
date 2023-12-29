package programmers.level_1;

/**
 * 크기가 작은 부분문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/147355
 */
public class No_147355 {
    public int solution(String t, String p) {
        int answer = 0;

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            int endIndex = i + p.length() > t.length() ? t.length() : i + p.length();

            String sub = t.substring(i, endIndex);
            if (Long.parseLong(sub) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}
