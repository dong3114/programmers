package main.programmers.lessons181903;

import java.util.ArrayList;

class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int cut = 0;
        int go = q;
        int arrSize = code.length()/go;

        ArrayList<String> result = new ArrayList<>();

        for(int i = 0; i < arrSize; i++){
            String word = code.substring(cut, q);
            result.add(word);
            cut = q;
            q += go;
        }
        for(int i = 0; i < result.size(); i++){
            answer += (result.get(i)).charAt(r);
        }
        return answer;
    }
}