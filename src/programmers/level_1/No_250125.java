package programmers.level_1;

/**
 * [PCCE 기출문제] 9번 / 이웃한 칸
 * https://school.programmers.co.kr/learn/courses/30/lessons/250125
 */
public class No_250125 {
    public int solution(String[][] board, int h, int w) {
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0 ,0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if (h_check >= 0 && h_check < board.length && w_check >= 0 && w_check < board.length) {
                if(board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        return count;
    }
}
