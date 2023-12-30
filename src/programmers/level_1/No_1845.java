package programmers.level_1;

import java.util.Arrays;

/**
 * 폰켓몬
 * https://school.programmers.co.kr/learn/courses/30/lessons/1845
 */
public class No_1845 {
    public int solution(int[] nums) {
        int[] array = Arrays.stream(nums).distinct().toArray();

        return array.length > nums.length / 2 ? nums.length / 2 : array.length;
    }
}
