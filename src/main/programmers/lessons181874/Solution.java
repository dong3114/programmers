package main.programmers.lessons181874;

class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            String str = String.valueOf(myString.charAt(i));
            if(str.equals("a") || str.equals("A")){
                str = "A";
                answer += str;
            } else{
                str = str.toLowerCase();
                answer += str;
            }
        }
        return answer;
    }
}