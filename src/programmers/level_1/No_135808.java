package programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 과일 장수
 * https://school.programmers.co.kr/learn/courses/30/lessons/135808
 */
public class No_135808 {
    public int solution(int k, int m, int[] score) { // 시간 초과
        int answer = 0;

        List<Integer> list = new ArrayList<>(Arrays.stream(score).boxed().collect(Collectors.toCollection(ArrayList::new)));

        for (int i = 0; i < score.length; i++) {
            Integer max = Collections.max(list);
            list.remove(max);
            if ((i + 1) % m == 0) {
                answer += max.intValue() * m;
            }
        }

        return answer;
    }

    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> list = new ArrayList<>(Arrays.stream(score).boxed().collect(Collectors.toCollection(ArrayList::new)));
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < score.length; i++) {
            if ((i + 1) % m == 0) {
                answer += list.get(i) * m;
            }
        }

        return answer;
    }
}
