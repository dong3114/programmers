package main.programmers.lessons181883;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] queries) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)answer.add(arr[i]);

        for(int i = 0; i < queries.length; i++){
            int start = queries[i][0];
            int end = queries[i][1];
            for(int j = start; j <= end; j++){
                int setNum = answer.get(j) + 1;
                answer.set(j, setNum);
            }
        }
        return answer;
    }
}