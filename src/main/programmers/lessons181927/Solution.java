package main.programmers.lessons181927;

import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList answer = new ArrayList();
        int lastNum = num_list.length - 1;
        int beforeNum = num_list.length - 2;

        for(int i = 0; i <= lastNum; i++){
            answer.add(num_list[i]);
        }

        if(num_list[lastNum] > num_list[beforeNum]){
            answer.add(num_list[lastNum] - num_list[beforeNum]);
        } else {
            answer.add(num_list[lastNum] * 2);
        }

        return answer;
    }
}