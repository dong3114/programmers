package main.programmers.lessons181915;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        ArrayList<Character> cha = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            char str = 0;
            str = my_string.charAt(i);
            cha.add(str);
        }
        for(int i = 0; i < index_list.length; i++){
            answer += cha.get(index_list[i]);
        }

        return answer;
    }
}