package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 자연수 뒤집어 배열로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 */
public class No_12932 {
    public int[] solution(long n) {
        List<Long> reverse = new ArrayList<>();

        while (true) {
            reverse.add(n % 10);
            if (n / 10 == 0) {
                break;
            } else {
                n /= 10;
            }
        }

        int[] answer = new int[reverse.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = reverse.get(i).intValue();
        }

        return answer;
    }
}
