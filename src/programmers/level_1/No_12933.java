package programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 정수 내림차순으로 배치하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class No_12933 {
    public long solution(long n) {
        long answer = 0;

        List<Integer> list = new ArrayList<>();
        while (true) {
            list.add((int) (n % 10));
            n /= 10;
            if(n == 0) {
                break;
            }
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * Math.pow(10, i);
        }

        return answer;
    }
}
