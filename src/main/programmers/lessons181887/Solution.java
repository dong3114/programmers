package main.programmers.lessons181887;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0;
        int even = 0;
        for(int i = 0; i < num_list.length; i+=2){
            odd += num_list[i];
        }
        for(int i = 1; i < num_list.length; i+=2){
            even += num_list[i];
        }
        if(even > odd){
            answer = even;
        } else {
            answer = odd;
        }
        return answer;
    }
}