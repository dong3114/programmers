package main.programmers.lessons181859;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(answer.isEmpty()){
                answer.add(arr[i]);
            } else {
                if(answer.get(answer.size() - 1).equals(arr[i])){
                    answer.remove(answer.size() - 1);
                } else {
                    answer.add(arr[i]);
                }
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }


        /**
        int i = 0;
        while (i < arr.length) {
            if (answer.isEmpty()) {
                answer.add(arr[i]);
                i += 1;
            }
            int n = 0;
            for(int j = 0; j < answer.size(); j++){
                n = answer.get(j);
            }
            if(!answer.isEmpty()) {
                if (arr[i] == n) {
                    int size = answer.size() - 1;
                    answer.remove(size);
                    i += 1;
                } else {
                    answer.add(arr[i]);
                    i += 1;
                }
            }
        }
        if(answer.isEmpty()){
            answer.add(-1);
        }
        */
        return answer;
    }
}