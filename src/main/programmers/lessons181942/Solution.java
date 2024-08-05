package main.programmers.lessons181942;

/**
 * 길이가 같은 두 문자열 str1과 str2가 주어집니다.
 * 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을
 * 만들어 return 하는 solution 함수를 완성해 주세요.
 */
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        /*
        // 원래 작성한 답
        //

        String a = "";
        String b = "";

        if (str1.length() >= str2.length()) {
            for(int i=0; i < str1.length(); i++) {
                for(int j=0; j < str2.length(); j++) {
                    b = str2.substring(j,j+1);
                    if (i > j) {
                        b = "";
                    }
                }
                answer += str1.substring(i,i+1) + b;
            }
        } else if (str2.length() > str1.length()) {
            for(int i=0; i < str2.length(); i++) {
                for(int j=0; j < str1.length(); j++) {
                    a = str1.substring(j,j+1);
                    if (i > j) {
                        a = "";
                    }
                }
                answer += a + str2.substring(i,i+1);
            }
        }

     */
        for(int i=0; i<str1.length(); i++){
            answer += str1.substring(i,i+1) + str2.substring(i,i+1);
        }
        return answer;
    }
}