package main.programmers.lessons181908;

import java.util.ArrayList;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            arr.add(my_string.substring(i, my_string.length()));
        }
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).equals(is_suffix)){
                answer = 1;
                break;
            } else{
                answer = 0;
            }
        }
        return answer;
    }
}