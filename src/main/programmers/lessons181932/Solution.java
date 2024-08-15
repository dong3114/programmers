package main.programmers.lessons181932;

import java.util.ArrayList;

class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;

        ArrayList arr = new ArrayList();

        ArrayList sum = new ArrayList();

        for(int i = 0; i < code.length(); i++) {
            arr.add(i, code.charAt(i));
        }

        for(int i = 0; i < arr.size(); i++) {
            if(mode == 0 && arr.get(i) != "1" && i % 2 == 0){
                sum.add(arr.get(i));
            } else if(mode == 0 && arr.get(i) == "1"){
                mode = 1;
            } else if(mode == 1 && arr.get(i) != "1" && i % 2 == 1){
                sum.add(arr.get(i));
            } else if(mode == 1 && arr.get(i) == "1") {
                mode = 0;
            } else if(arr.size() < 0) {
                answer = "EMPTY";
                break;
            }
            answer = sum.toString();
        }
        System.out.println(mode);

        return answer;
    }
}