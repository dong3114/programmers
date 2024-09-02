package main.programmers.lessons181911;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < my_strings.length; i++) {
            int startNum = parts[i][0];
            int endNum = parts[i][1];
            for(int j = startNum; j <= endNum; j++){
                answer += String.valueOf(my_strings[i].charAt(j));
            }
        }
        return answer;
    }
}