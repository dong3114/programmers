package main.programmers.lessons181902;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(char i='A'; i <= 'Z'; i++){
            int count = 0;
            for(char j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == i){
                    count++;
                }
            }
            answer.add(count);
        }
        for(char i='a'; i <= 'z'; i++){
            int count = 0;
            for(int j = 0; j < my_string.length(); j++){
                if(my_string.charAt(j) == i){
                    count++;
                }
            }
            answer.add(count);
        }
        System.out.println(answer.size());
        return answer;
    }
}