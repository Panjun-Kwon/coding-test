package programmers.level_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 나누어 떨어지는 숫자 배열
 * https://school.programmers.co.kr/learn/courses/30/lessons/12910
 */
public class No_12910 {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }
        Collections.sort(list);

        int[] answer;
        if (list.size() == 0) {
            return new int[] {-1};
        } else {
            answer = new int[list.size()];
        }

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
