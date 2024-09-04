package main.programmers.lessons181909;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        int limitNum = my_string.length();
        for(int i = 0; i < my_string.length(); i++){
            String newStr = my_string.substring(i, limitNum);
            answer.add(newStr);
        }
        Collections.sort(answer);
        return answer;
    }
}