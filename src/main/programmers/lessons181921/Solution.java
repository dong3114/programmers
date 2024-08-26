package main.programmers.lessons181921;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int l, int r) {
        ArrayList<Integer> answer = new ArrayList<>();
        String n = "";
        String pattern = "^[05]+$";

        for(int i = l; i <= r; i++){
            n = String.valueOf(i);

            if(n.matches(pattern)) {
                answer.add(i);
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        return answer;
    }
}