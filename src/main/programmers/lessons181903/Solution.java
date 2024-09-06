package main.programmers.lessons181903;

import java.util.ArrayList;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i < code.length(); i++){
            String cha = String.valueOf(code.charAt(i));
            int na = code.substring(0, i).length()%q;
            if(na == r){
            result.add(cha);
            }
        }
        for(int i = 0; i < result.size(); i++){
            answer += result.get(i);
        }
        return answer;
    }
}