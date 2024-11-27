package main.programmers.lessons181856;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length == arr2.length){
            if(samelogic(arr1) == samelogic(arr2)){
                answer = 0;
            } else if (samelogic(arr1) > samelogic(arr2)) {
                answer = 1;
            } else {
                answer = -1;
            }
        }

        if(arr1.length > arr2.length){
            answer = 1;
        } else if(arr1.length < arr2.length){
            answer = -1;
        }



        return answer;
    }

    public int samelogic(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}