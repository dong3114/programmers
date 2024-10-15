package main.programmers.lessons181867;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> answer = new ArrayList<>();
        int n = 0;
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("x")){
                answer.add(n);
                n = 0;
            } else {
                n++;
            }
        }
        answer.add(n);
        return answer;
    }
}