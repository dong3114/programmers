package main.programmers.lessons181914;

// 아스키코드로 변환되지 않고 숫자로 변환 시킬때 '0'을 빼준다
class Solution {
    public int solution(String number) {
        int answer = 0;
        int n = 0;

        for(int i = 0; i < number.length(); i++){
            n += number.charAt(i) - '0';
        }
        return answer = n % 9;
    }
}