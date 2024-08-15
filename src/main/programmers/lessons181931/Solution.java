package main.programmers.lessons181931;

import java.util.ArrayList;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        ArrayList<Integer> plus = new ArrayList<>();

        for(int i = 0; i < included.length; i++) {
            plus.add(i, a);
            a += d;
            if(included[i]){
                answer += plus.get(i);
            } else if(!included[i]){
                answer += 0;
            }
        }
        return answer;
    }
}