package main.programmers.lessons181884;

class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            if(sum > n){
                break;
            }
            sum += numbers[i];
        }
        return answer = sum;
    }
}