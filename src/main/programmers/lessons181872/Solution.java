package main.programmers.lessons181872;

class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int gap = pat.length();
        int remember = 0;
        for(int i = 0; i <= myString.length() - gap; i++){
            String a = myString.substring(i, i + gap);
            if(a.equals(pat)){
                remember = i + gap;
            }
        }
        return answer = myString.substring(0, remember);
    }
}