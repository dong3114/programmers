package main.programmers.lessons181926;

import java.util.ArrayList;

class Solution {
    public int solution(int n, String control) {
        int answer = n;
        ArrayList point = new ArrayList();
        char w = 'w';
        char s = 's';
        char d = 'd';
        char a = 'a';

        for(int i=0; i<control.length(); i++){
            point.add(control.charAt(i));
            if(point.get(i).equals(w)){
                answer += 1;
            } else if(point.get(i).equals(s)){
                answer -= 1;
            } else if(point.get(i).equals(d)){
                answer += 10;
            } else if(point.get(i).equals(a)){
                answer -= 10;
            }
        }
        return answer;
    }
}