package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 제일 작은 수 제거하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12935
 */
public class No_12935 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            list.add(i);
        }

        list.remove(list.stream()
                .min(Integer::compareTo)
                .orElseThrow());

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
