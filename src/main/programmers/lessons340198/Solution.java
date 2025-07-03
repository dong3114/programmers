package main.programmers.lessons340198;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 1. 돗자리는 정사각형
 * 2. 깔수있는 공간중 지민이가 깔 수 있는 가장 큰 면적
 * 3. park[][]의 갯수에 따라 몇 행인지 확인
 * 4. park[] 의 인덱스 수 에 따라서 몇 열인지 구분
 * 5. 아무런 돗자리를 깔 수 없을땐 -1 리턴, 그외는 mats 중 가장 큰 길이의 돗자리 리턴
 */

public class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int p_row = park.length;
        int p_col = park[0].length;
        ArrayList<Integer> mats_sort = new ArrayList<>();
        for(int i=0;i<mats.length;i++)mats_sort.add(mats[i]);
        Collections.sort(mats_sort, Collections.reverseOrder());
        // 윈도우 슬라이드 형태로 이전과 비교해서 둘이 같으면 true
        for(int i=0; i< mats_sort.size(); i++){
            // 큰수부터 출력하기
            int j = mats_sort.get(i);
            // 1. 전체 y축을 넘지 않고 y의 길이 비교
            for(int row=0; row <= p_row-j; row++){
                // 2. 전체 매트 크기를 넘지 않게 비교 조건
                for(int col=0; col <= p_col-j; col++){
                    boolean key = true;
                    // 3. x * y 내부의 행렬 탐색 후 -1 발견시 탈출
                    for(int x=0; x < j && key; x++){
                        for (int y=0; y < j; y++){
                            if(!park[row+x][col+y].equals("-1")){
                                key = false;
                                break;
                            }
                        }
                    }
                    if(key) return j;
                }
            }
        }
        return answer;
    }
}
