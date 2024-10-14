package main.programmers.lessons181868;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String my_string) {
        ArrayList<String> answer = new ArrayList<>();
        String str = "";

        for(int i = 0; i < my_string.length(); i++){
            String a = String.valueOf(my_string.charAt(i));
            if(!a.equals(" ")){
                str += a;
            } else if(a.equals(" ") && !str.equals("")){
                answer.add(str);
                str = "";
            }
        }
        if(!str.equals("")){
            answer.add(str);
        }
        return answer;
    }
}