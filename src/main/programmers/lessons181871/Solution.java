package main.programmers.lessons181871;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int gap = pat.length();
        for(int i = 0; i <= myString.length() - gap; i++){
            String a = myString.substring(i, i + gap);
            if(pat.equals(a)){
                answer++;
            }
        }
        return answer;
    }
}