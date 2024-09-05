package main.programmers.lessons181905;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            char c = my_string.charAt(i);
            arr.add(c);
        }
        for(int i = s; i < e; i++){
            char pre = arr.get(i);
            char pu = arr.get(e);
            if(s != e){
                arr.set(s, pu);
                arr.set(e, pre);
            } else if(s == e){
                break;
            }
            s++;
            e--;
        }
        for(int i = 0; i < arr.size(); i++){
            answer += arr.get(i);
        }
        return answer;
    }
}