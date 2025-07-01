package main.programmers.lessons340213;

import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Solution s = new Solution();
        String video_len = "34:33";
        String pos = "13:00";
        String op_start = "00:55";
        String op_end = "02:55";
        String[] commands ={"next", "prev"};

        String sl = s.solution(video_len,pos,op_start,op_end,commands);
        System.out.println(sl);
    }
}
