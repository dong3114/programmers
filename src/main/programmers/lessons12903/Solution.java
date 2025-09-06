package main.programmers.lessons12903;

/**
 * 단어 s의 가운데 글자를 반환하는 함수를 만들어라. 단어의 길이가 짝수라면 가운데 두글자를 반환.
 */
public class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0) {
            answer = Character.toString(s.charAt(s.length()/2-1)) + Character.toString(s.charAt(s.length()/2));
        } else {
            answer = Character.toString(s.charAt(s.length()/2));
        }
        return answer;
    }
}
