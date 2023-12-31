package programmers.level_0;

/**
 * 2차원으로 만들기
 * https://school.programmers.co.kr/learn/courses/30/lessons/120842
 */
public class No_120842 {
    public int[][] solution(int[] num_list, int n) {
        int row = num_list.length / n;

        int[][] answer = new int[row][n];

        int k = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < n; j++) {
                answer[i][j] = num_list[k++];
            }
        }

        return answer;
    }
}
