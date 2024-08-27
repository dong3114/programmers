package main.programmers.dada;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        ArrayList<Integer> set = new ArrayList<>();
        Arrays.sort(d);

        for(int i = 0; i < d.length; i++){
            result += d[i];
            if(result > budget){
                result -= d[i];
                break;
            }
            set.add(d[i]);
        }

        return answer = set.size();
    }
}