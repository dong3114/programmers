package main.programmers.lessons340213;

public class Solution {
    public static String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoLengthSec = toSeconds(video_len);
        int currentPosSec = toSeconds(pos);
        int opStartSec = toSeconds(op_start);
        int opEndSec = toSeconds(op_end);

        // 오프닝 구간에 있다면 자동 이동
        if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
            currentPosSec = opEndSec;
        }

        for (int i = 0; i < commands.length; i++) {
            String command = commands[i];

            if (command.equals("prev")) {
                currentPosSec = Math.max(0, currentPosSec - 10);
            } else if (command.equals("next")) {
                currentPosSec = Math.min(videoLengthSec, currentPosSec + 10);
            }

            // 각 명령 처리 후 오프닝 구간에 있다면 자동 이동
            if (currentPosSec >= opStartSec && currentPosSec <= opEndSec) {
                currentPosSec = opEndSec;
            }
        }

        return toTimeFormat(currentPosSec);
    }

    // mm:ss → 초로 변환
    private static int toSeconds(String time) {
        String[] parts = time.split(":");
        int min = Integer.parseInt(parts[0]);
        int sec = Integer.parseInt(parts[1]);
        return min * 60 + sec;
    }

    // 초 → mm:ss 로 변환
    private static String toTimeFormat(int totalSeconds) {
        int min = totalSeconds / 60;
        int sec = totalSeconds % 60;
        return String.format("%02d:%02d", min, sec);
    }
}
