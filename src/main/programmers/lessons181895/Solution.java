package main.programmers.lessons181895;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i < intervals.length; i++){
            int startNumber = intervals[i][0];
            int endNumber = intervals[i][1];
            for(int j = startNumber; j <= endNumber; j++){
                int addNum = arr[j];
                answer.add(addNum);
            }
        }
        return answer;
    }
}