package main.programmers.lessons181863;

class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i = 0; i < rny_string.length(); i++){
            String a = String.valueOf(rny_string.charAt(i));
            if(a.equals("m")){
                answer += "rn";
            } else {
                answer += a;
            }
        }
        return answer;
    }
}