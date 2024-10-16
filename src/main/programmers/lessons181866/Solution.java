package main.programmers.lessons181866;

import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public ArrayList<String> solution(String myString) {
        ArrayList<String> answer = new ArrayList<>();
        String a = "";
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("x")){
                if(!a.equals("")) {
                    answer.add(a);
                    a = "";
                }
            } else {
                a += str;
            }
        }
        if(!a.equals("")){
            answer.add(a);
        }
        Collections.sort(answer);
        return answer;
    }
}