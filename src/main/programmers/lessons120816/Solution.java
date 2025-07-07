package main.programmers.lessons120816;

public class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        int p_s = slice;
        while (p_s < n) {
            p_s = p_s + slice;
            answer+=1;
        }
        return answer;
    }
}
