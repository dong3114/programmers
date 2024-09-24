package main.programmers.lessons181890;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] str_list) {
        ArrayList<String> answer = new ArrayList<>();
        String first = "";
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l")){
                first = str_list[i];
                for(int j = 0; j < i; j++){
                    answer.add(str_list[j]);
                }
                break;
            } else if(str_list[i].equals("r")){
                for(int j = i+1; j < str_list.length; j++){
                    answer.add((str_list[j]));
                }
                break;
            }
        }
        return answer;
    }
}