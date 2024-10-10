package main.programmers.lessons181869;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String str = "";
        for(int i = 0; i < my_string.length(); i++){
            String piece = String.valueOf(my_string.charAt(i));
            if(piece.equals(" ")){
                answer.add(str);
                str = "";
            } else {
                str += piece;
            }
        }
        answer.add(str);
        return answer;
    }
}