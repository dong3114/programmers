package main.programmers.lessons181919;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        boolean key = true;

        while(key) {
            answer.add(n);
            if(n == 1){
                break;
            }
            if(n % 2 == 0){
                n = n/2;
            } else if(n % 2 == 1 && n != 1){
                n = (n * 3) + 1;
            }
        }
        return answer;
    }
}