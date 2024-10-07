package main.programmers.lessons181878;

class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int bar = pat.length();
        boolean key = false;
        pat = pat.toLowerCase();
        for(int i = 0; i <= myString.length() - bar; i++){
            String str = myString.substring(i, i + bar).toLowerCase();
            if(str.equals(pat)){
                key = true;
                break;
            }
        }
        if(key){
            answer = 1;
        }
        return answer;
    }
}