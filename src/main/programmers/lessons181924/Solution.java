package main.programmers.lessons181924;

/**
 * arr의 원형에서 queries에 있는 있는 index 값을 바꾼다.
 */
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        int queryOne = 0;
        int queryTwo = 0;
        int arrOne = 0;
        int arrTwo = 0;

        for(int i = 0; i < queries.length; i++){
            queryOne = queries[i][0];
            queryTwo = queries[i][1];

            arrOne = arr[queryOne];
            arrTwo = arr[queryTwo];

            arr[queryOne] = arrTwo;
            arr[queryTwo] = arrOne;
            for(int j = 0; j < arr.length; j++){
                answer[j] = arr[j];
            }
        }
        return answer;
    }
}