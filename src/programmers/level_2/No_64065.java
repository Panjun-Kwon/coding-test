package programmers.level_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 튜플
 * https://school.programmers.co.kr/learn/courses/30/lessons/64065
 */
public class No_64065 {
    public int[] solution(String s) {
        int[] answer = {};

        s = s.substring(2, s.length() - 2);
        String[] splitS = s.split("},\\{");
        Arrays.sort(splitS, (str1, str2) -> Integer.compare(str1.length(), str2.length()));
        List<Integer> list = new ArrayList<>();
        for (String str : splitS) {
            String[] splitStr = str.split(",");
            for (String s1 : splitStr) {
                int i = Integer.parseInt(s1);
                if (!list.contains(i)) {
                    list.add(i);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
