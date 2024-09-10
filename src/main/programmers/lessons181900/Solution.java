package main.programmers.lessons181900;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        ArrayList<Character> cha = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            cha.add(c);
            if(cha.size() == my_string.length()){
                for(int j = 0; j < indices.length; j++){
                    cha.set(indices[j], ',');
                }
            }
        }
        for(int i = 0; i < cha.size(); i++){
            if(!cha.get(i).equals(',')){
                answer += cha.get(i);
            }
        }

        return answer;
    }
}