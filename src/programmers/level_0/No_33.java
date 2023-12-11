package programmers.level_0;

/**
 * 자릿수 더하기
 */
public class No_33 {
    public int solution(int n) {
        int answer = 0;

        String str = String.valueOf(n);
        String[] split = str.split("");
        for (String s : split) {
            answer += Integer.valueOf(s);
        }

        return answer;
    }
}
