package programmers.level_1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 3진법 뒤집기
 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
 */
public class No_68935 {
    public int solution(int n) {
        String ternary = Integer.toString(n, 3);
        StringBuilder sb = new StringBuilder(ternary);
        sb.reverse();
        return Integer.parseInt(sb.toString(), 3);
    }
}
