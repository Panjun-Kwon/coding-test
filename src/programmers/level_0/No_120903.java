package programmers.level_0;

/**
 * 배열의 유사도
 * https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
public class No_120903 {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if(s1[i].equals(s2[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
