package main.programmers.lessons181862;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String myStr) {
        ArrayList<String> answer = new ArrayList<>();
        String str = "";

        for(int i = 0; i < myStr.length(); i++){
            String a = String.valueOf(myStr.charAt(i));
            if(!str.equals("")) {
                if (a.equals("a") || a.equals("b") || a.equals("c")) {
                    answer.add(str);
                    str = "";
                } else {
                    str += a;
                }
            } else if(str.equals("")){
                if (a.equals("a") || a.equals("b") || a.equals("c")) {
                    str = "";
                } else {
                    str += a;
                }
            }
        }
        if(!str.equals("")){
            answer.add(str);
        } else if (answer.isEmpty()) {
            answer.add("EMPTY");
        }
        return answer;
    }
}