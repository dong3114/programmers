package main.programmers.lessons181912;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            int n = 0;
            n = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(n > k){
                answer.add(n);
            }
        }
        return answer;
    }
}