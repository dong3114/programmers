package main.programmers.mun;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0; // 같은색
        String color = board[h][w];

        if (board[h - 1][w].equals(color)) {
            ++count;
        }
        if (board[h][w].equals(color)) {
            ++count;
        }
        if (board[h][w - 1].equals(color)) {
            ++count;
        }
        if (board[h][w + 1].equals(color)) {
            ++count;
        }
        if (board[h + 1][w].equals(color)) {
            ++count;
        }

        return answer = count;
    }
}