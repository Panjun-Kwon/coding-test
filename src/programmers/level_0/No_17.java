package programmers.level_0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 최댓값 만들기 (1)
 */
public class No_17 {
    public int solution(int[] numbers) {
        int answer = 0;

        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j) {
                    continue;
                }
                arr.add(numbers[i]*numbers[j]);
            }
        }

        answer = Collections.max(arr);

        return answer;
    }
}
