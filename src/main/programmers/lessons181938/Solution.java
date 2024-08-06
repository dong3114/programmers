package main.programmers.lessons181938;

/**
 * 연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다.
 */
class Solution {
    public int solution(int a, int b) {
        int answer = 0;

        String strA = Integer.toString(a);
        String strB = Integer.toString(b);

        String sumAB = strA + strB;

        int AB = Integer.valueOf(sumAB);
        int optionAB = 2 * a * b;

        if(AB >= optionAB) {
            answer = AB;
        } else {
            answer = optionAB;
        }
        return answer;
    }
}