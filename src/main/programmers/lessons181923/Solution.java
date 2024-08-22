package main.programmers.lessons181923;

import java.util.ArrayList;
import java.util.Collections;

/**
 * queries의
 * 쿼리 인덱스[0] arr 배열의 시작점
 * 쿼리 인덱스[1] arr 배열의 마지막
 * 쿼리 인덱스[2] 기준값
 */
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for(int i = 0; i < queries.length; i++){
            ArrayList<Integer> queryArray = new ArrayList<>();

            for(int j = queries[i][0]; j < queries[i][1] + 1; j++){
                if(arr[j] > queries[i][2]){
                    queryArray.add(arr[j]);
                }
            }
            if(!queryArray.isEmpty()) {
                answer[i] = Collections.min(queryArray);
            } else {
                answer[i] = -1;
            }
        }
        return answer;
    }
}
