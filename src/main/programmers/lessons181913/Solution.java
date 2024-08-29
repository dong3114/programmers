package main.programmers.lessons181913;

import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        ArrayList<String> str = new ArrayList<>();

        for(int i = 0; i < answer.length(); i++){
            str.add(String.valueOf(answer.charAt(i)));
        }

        for(int i = 0; i < queries.length; i++){
            int start = 0;
            int end = 0;
            start = queries[i][0];
            end = queries[i][1];
            for(int j = start; j <= end; j++){
                String one = str.get(end);
                String two = str.get(start);

                str.set(start, one);
                str.set(end, two);
                ++start;
                --end;
            }
        }
        String result = "";

        for(int i = 0; i < str.size(); i++){
            result += str.get(i);
        }

        return answer = result;
    }
}