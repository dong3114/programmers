package main.programmers.lessons181939;

class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String strA = Integer.toString(a);
        String strB = Integer.toString(b);
        String sumAB = strA + strB;
        String sumBA = strB + strA;

        int AB = Integer.valueOf(sumAB);
        int BA = Integer.valueOf(sumBA);

        if(AB > BA) {
            answer = AB;
        } else {
            answer = BA;
        }
        return answer;
    }
}