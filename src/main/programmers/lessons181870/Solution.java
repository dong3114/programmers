package main.programmers.lessons181870;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        ArrayList<Boolean> matchArr = new ArrayList<>();
        String filter = "ad";
        int gap = filter.length();

        for(int i = 0; i < strArr.length; i++){
            boolean match = true;
            for(int j = 0; j <= strArr[i].length() - gap; j++){
                if(filter.equals(strArr[i].substring(j, j + gap))){
                    match = false;
                    break;
                }
            }
            matchArr.add(match);
        }
        for(int i = 0; i < matchArr.size(); i++){
            if(matchArr.get(i)){
                String a = strArr[i];
                answer.add(a);
            }
        }
        return answer;
    }
}