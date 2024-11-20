package main.programmers.lessons181857;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int size = arr.length;
        int count = 0;
        if(check(size, count) == 1){
            for(int i = 0; i < size; i++){
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public int check(int size, int count){
        if(size%2 == 0){
            int n = size / 2;
            int x = count + 1;
            return check(n, x);
        } else {
            return size;
        }
    }

}

