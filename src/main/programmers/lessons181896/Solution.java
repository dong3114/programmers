package main.programmers.lessons181896;

class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] < 0){
                return  answer = i;
            }
        }

        return answer;
    }
}