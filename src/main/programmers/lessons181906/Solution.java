package main.programmers.lessons181906;

import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            arr.add(my_string.substring(0, i));
        }
        if(arr.contains(is_prefix)){
            answer = 1;
        } else{
            answer = 0;
        }
        return answer;
    }
}