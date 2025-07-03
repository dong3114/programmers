package main.programmers.lessons250125;

import java.util.ArrayList;

public class Solution {
    // 특정 칸을 선택했을때 위, 아래, 왼쪽, 오른쪽 칸 중 같은 색깔로 칠해진 칸의 개수 구하기.
    // board[h][w]와 이웃한 칸들 중 같은 색으로 칠해져 있는 칸의 갯수를 return
    public int solution(String[][] board, int h, int w) {
        // 같은 열 비교 (w,h+1), (w,h-1)
        // 같은 행 비교 (w+1,h), (w-1,h)
        // 예외처리: 리스트 범위 체크
        int answer = 0;
        int xLen = board[0].length;
        int yLen = board.length;
        // {h+1,w}, {h-1,w}, {h,w+1}, {h,w-1}}
        ArrayList<String> selectColor = new ArrayList<>();
        for(int y = h-1; y < h+1; y++){
            if(y<0 || y >= yLen)continue;    // y축이 배열 넘었을때
            for(int x = w-1; x < w+1; x++){
                if(x<0 || x >= xLen) continue;
                if(y==h && x==w) continue;   // 자기 자신은 넣지 않기
                selectColor.add(board[y][x]);
            }
        }
        for(int i=0; i<selectColor.size(); i++){
            String colorXY = selectColor.get(i);
            if(colorXY.equals(board[h][w])){
                answer +=1;
            }
        }
        return answer;
    }
}
