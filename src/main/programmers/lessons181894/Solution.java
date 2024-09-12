package main.programmers.lessons181894;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int firstTwo = -1;
        int lastTwo = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                if(firstTwo == -1){
                    firstTwo = i;
                    lastTwo = i;
                } else {
                    lastTwo = i;
                }
            }
        }
        if(firstTwo != -1) {
            for (int i = firstTwo; i <= lastTwo; i++) {
                answer.add(arr[i]);
            }
        }

        int count = Collections.frequency(answer, 2);
        if(firstTwo == -1){
            answer.clear();
            answer.add(-1);
        } else if(count == 1){
            answer.clear();
            answer.add(2);
        }
        return answer;
    }
}