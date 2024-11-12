package main.programmers.lessons181860;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> answer = new ArrayList<>();
        int num = 0;
        boolean check = true;

        for(int i = 0; i < arr.length; i++){
            num = arr[i];
            check = flag[i];
            if(check){
                for(int j = 0; j < num*2; j++) {
                    answer.add(num);
                }
            } else{
                for(int j = 0; j < num; j++){
                    int a = answer.size() - 1;
                    answer.remove(a);
                }
            }
        }

        return answer;
    }
}