package main.programmers.lessons181893;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] query) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            answer.add(arr[i]);
        }
        for(int i = 0; i < query.length; i++){
            if(i % 2 == 0){
                while (answer.size() > query[i] + 1) {
                    answer.remove(answer.size() - 1);
                }
            } else if(i % 2 == 1){
                while (query[i] > 0) {
                    answer.remove(0);
                    query[i]--;
                }
            }
        }
        return answer;
    }
}