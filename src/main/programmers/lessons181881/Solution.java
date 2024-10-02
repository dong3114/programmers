package main.programmers.lessons181881;

import java.util.ArrayList;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        boolean key = true;
        ArrayList<Integer> copy = new ArrayList();
        for(int i = 0; i < arr.length; i++)copy.add(arr[i]);

        while (key){
            for(int i = 0; i < arr.length; i++){
                int n = arr[i];

                if(n >= 50 && n % 2 == 0){
                    arr[i] = n /2;
                } else if(n < 50 && n % 2 == 1){
                    arr[i] = (n*2) + 1;
                }
            }
            int count = 0;

            for(int i = 0; i < arr.length; i++){
                if(arr[i] == copy.get(i)){
                    count++;
                } else if(arr[i] != copy.get(i)){
                    copy.set(i, arr[i]);
                }
            }
            if(count == arr.length){
                key=false;
                break;
            }
            answer++;
        }
        return answer;
    }
}