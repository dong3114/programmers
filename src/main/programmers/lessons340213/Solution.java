package main.programmers.lessons340213;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    /**
     *
     * @param video_len 비디오 전체 길이
     * @param pos 현재 비디오 위치
     * @param op_start 오프닝 시작 지점
     * @param op_end 오프닝 end 지점
     * @param commands 사용자 입력
     * @return 반환 동영상 지점
     */
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("mm:ss");
        String answer = "";
        Date firstTime = format.parse(pos);
        Date useTime = format.parse("00:10");
        Date minTime = format.parse("00:00");
        Date op_s = format.parse(op_start);
        Date op_e = format.parse(op_end);
        long resultType = 0;
        for(int i = 0; i < commands.length; i++){
            if(commands[i].equals("prev")){
                if(firstTime.getTime() < useTime.getTime()){
                    firstTime =minTime;
                } else {
                    // 결과 시간이 00:00초를 벗어날수 없다.
                    resultType = firstTime.getTime() - useTime.getTime();
                    firstTime = new Date(resultType); // 🔧 누락된 부분
                }
            } else {
                long nextTime = firstTime.getTime() + useTime.getTime();
                if(firstTime.getTime() >= op_s.getTime() && firstTime.getTime() < op_e.getTime()){
                    firstTime = op_e;
                    resultType = firstTime.getTime() + useTime.getTime();
                    firstTime = new Date(resultType);
                    resultType = firstTime.getTime();
                } else if (nextTime >= op_s.getTime() && nextTime < op_e.getTime()) {
                    firstTime = op_e;
                    resultType = firstTime.getTime();
                } else{
                    resultType = nextTime;
                    firstTime = new Date(resultType);
                }
            }
        }
        answer = format.format(firstTime);
        return answer;
    }
}
