package main.programmers.lessons181897;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if(n==1){
            for(int i=0; i <= b; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 2){
            for(int i=a; i < num_list.length; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 3){
            for(int i=a; i <= b; i++){
                answer.add(num_list[i]);
            }
        } else if(n == 4){
            for(int i=a; i <= b; i+=c){
                answer.add(num_list[i]);
            }
        }
        return answer;
    }
}