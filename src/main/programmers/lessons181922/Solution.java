package main.programmers.lessons181922;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int s = 0;
        int e = 0;
        int k = 0;

        for(int i = 0; i <queries.length; i++){
            s = queries[i][0];
            e = queries[i][1];
            k = queries[i][2];

            for(int j = s; j <= e; j++){

                if(j % k == 0){
                    arr[j] = arr[j] + 1;
                }
            }
        }

        return answer = arr;
    }
}