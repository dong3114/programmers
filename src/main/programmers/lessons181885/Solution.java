package main.programmers.lessons181885;

import java.util.ArrayList;

class Solution {
    public ArrayList<String> solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> answer = new ArrayList<>();
        for(int i = 0; i < todo_list.length; i++){
            String a = todo_list[i];
            boolean b = finished[i];
            if(b == true){
                answer.add(a);
            }
        }
        return answer;
    }
}