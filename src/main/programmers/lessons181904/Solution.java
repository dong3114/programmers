package main.programmers.lessons181904;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String str = "";
        int w = m;
        ArrayList<String> put = new ArrayList<>();

        for(int i = 0; i < my_string.length(); i+=w){
            str = my_string.substring(i, m);
            put.add(str);
            m += w;
        }
        for(int i = 0; i < put.size(); i++){
            answer += put.get(i).charAt(c - 1);
        }
        return answer;
    }
}