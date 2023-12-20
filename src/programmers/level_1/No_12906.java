package programmers.level_1;

import java.util.ArrayList;
import java.util.List;

/**
 * 같은 숫자는 싫어
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class No_12906 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        int num = -1;
        for (int i = 0; i < arr.length; i++) {
            if (num != arr[i]) {
                num = arr[i];
                list.add(num);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
