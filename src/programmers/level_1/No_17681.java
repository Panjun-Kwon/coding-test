package programmers.level_1;

/**
 * [1차] 비밀지도
 * https://school.programmers.co.kr/learn/courses/30/lessons/17681
 */
public class No_17681 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        for (int i = 0; i < n; i++) {
            map[i] = String.format("%0" + n + "d", Long.parseLong(Long.toString(arr1[i] | arr2[i], 2)));
        }

        for (int i = 0; i < map.length; i++) {
            map[i] = map[i].replaceAll("1", "#");
            map[i] = map[i].replaceAll("0", " ");
        }

        return map;
    }
}
