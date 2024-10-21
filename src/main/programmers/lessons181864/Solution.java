package main.programmers.lessons181864;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            String a = String.valueOf(myString.charAt(i));
            if(a.equals("A")){
                a = "B";
                str += a;
            } else if(a.equals("B")){
                a = "A";
                str += a;
            }
        }
        if(str.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}