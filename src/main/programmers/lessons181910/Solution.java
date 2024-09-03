package main.programmers.lessons181910;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        int endPoint = my_string.length();
        ArrayList<Character> s = new ArrayList<>();

        for(int i = my_string.length() - 1; i >= my_string.length() - n; i--){
            s.add(my_string.charAt(i));
        }

        Collections.reverse(s);
        for(int i = 0; i < s.size(); i++){
            answer += s.get(i);
        }

        return answer;
    }
}