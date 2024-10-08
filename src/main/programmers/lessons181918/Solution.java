package main.programmers.lessons181918;

import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i = 0;

        while (i < arr.length) {
            if (stk.isEmpty() || stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
                i += 1;
            } else if(stk.get(stk.size()-1) >= arr[i]){
                stk.remove(stk.size()-1);
            }
        }
        return stk;
    }
}