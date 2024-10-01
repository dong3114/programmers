package main.programmers.lessons181882;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList();
        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            if(n >= 50 && n % 2 == 0){
                answer.add(n/2);
            } else if(n < 50 && n % 2 == 1){
                answer.add(n*2);
            } else {
                answer.add(n);
            }
        }
        return answer;
    }
}