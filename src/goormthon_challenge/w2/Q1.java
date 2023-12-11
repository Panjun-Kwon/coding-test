package goormthon_challenge.w2;

import java.util.*;

/**
 * 문자열 나누기
 */
public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 문자열 길이
        String S = scanner.next(); // 문자열

        ArrayList<SubStr> subStrList = new ArrayList<>(); // 3분할
        for (int i = 1; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                SubStr subStr = new SubStr();
                String[] sub = new String[3];

                sub[0] = S.substring(0, i);
                sub[1] = S.substring(i, j);
                sub[2] = S.substring(j);

                subStr.setStr(sub);
                subStrList.add(subStr);
            }
        }

        Set<String> subStrSet = new HashSet<>(); // 중복 제거
        for (SubStr subStr : subStrList) {
            for (String s : subStr.getStr()) {
                subStrSet.add(s);
            }
        }
        List<String> subList = new ArrayList<>(subStrSet);
        Collections.sort(subList); // 사전순 정렬

        for (SubStr subStr : subStrList) {
            for (String str : subStr.getStr()) {
                subStr.setScore(subStr.getScore() + subList.indexOf(str) + 1);
            }
        }

        SubStr max = Collections.max(subStrList);
        System.out.println(max.getScore());
    }
}

class SubStr implements Comparable<SubStr> {
    private String[] str = new String[3];
    private int score = 0;

    public String[] getStr() {
        return str;
    }

    public int getScore() {
        return score;
    }

    public void setStr(String[] str) {
        this.str = str;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(SubStr o) {
        return score - o.score;
    }
}
