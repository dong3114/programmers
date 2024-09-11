package main.programmers.lessons181898;

class Solution {
    public int solution(int[] arr, int idx) {
        int answer = 0;
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                answer = i;
                break;
            } else if(i == arr.length-1 && answer == 0){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}