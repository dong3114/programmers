package main.programmers.lessons181943;

import java.util.Scanner;

/**
 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 * 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 * 문자열 overwrite_string으로 바꾼 문자열을 return 하는
 * solution 함수를 작성해 주세요.
 */
class Solution {
    public String solution(String my_string,
                           String overwrite_string,
                           int s) {
        String answer = "";
        // 자를 문자열 길이
        int size = overwrite_string.length();

        // 주어진 int 0부터 s까지 잘라진 문자
        String firstWord = my_string.substring(0, s);

        // 마지막 문자열
        String secondWord = my_string.substring(s + size);

        // 합
        answer = firstWord + overwrite_string + secondWord;

        return answer;
    }
}