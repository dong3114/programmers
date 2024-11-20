package main.programmers.lessons181857;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int size = arr.length;
        if(size == 0){
            answer.add(0);
            return answer;
        }
        int count = check(size);
        for(int i = 0; i < count; i++){
            if(i < arr.length){
                answer.add(arr[i]);
            } else {
                answer.add(0);
            }
        }
        return answer;
    }

    public int check(int size) {
        int power = 1;
        while (power < size){
            power *= 2;
        }
        return power;
    }
}

