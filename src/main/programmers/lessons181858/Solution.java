package main.programmers.lessons181858;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int k) {
        ArrayList<Integer> answer = new ArrayList<>();
        int size = k;
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(answer.contains(n)){
                continue;
            }
            if(answer.size() < k){
                answer.add(n);
            } else {
                break;
            }

        }
        while (answer.size() < k){
            answer.add(-1);
        }
        return answer;
    }
}