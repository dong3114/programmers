package main.programmers.lessons181888;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] num_list, int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < num_list.length; i += n){
            answer.add(num_list[i]);
            if(i+n > num_list.length){
                break;
            }
        }
        return answer;
    }
}