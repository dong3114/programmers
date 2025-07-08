package main.chcek;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 멤버변수
 * int 카운트
 * int 시간 제한
 * 메서드
 * private 증감에 대한 메서드
 */
public class SitUp {
    Scanner sc = new Scanner(System.in);
    // 회원의
    private Member member;
    private int timeLimit;
    private int count;
    private boolean isSitUp;   // 기록 측정 종료임을 알리기 위한 변수

    public SitUp(Member member, int timeLimit, int count, boolean isSitUp){
        this.member = member;
        this.timeLimit = timeLimit;
        this.count = count;
        this.isSitUp = isSitUp;
    }

    public int doRecording() {
        this.isSitUp = true;
        // 1. 시간 측정 객체 생성
        Timer timer = new Timer();
        // 2. 시간 측정 로직 작성
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                isSitUp = false;
                System.out.println("측정을 종료 합니다.");
                timer.cancel(); // 타이머 종료
            }
        };
        // 3. limit 시간지정
        timer.schedule(task, this.timeLimit);
        do{
            // 4. 측정 시작 알림
            System.out.println("측정을 시작합니다.");
            // 5. 내려가기 액션
            System.out.println("몸을 내리려면 1을 입력해 주세요.");
            sitAction();
            // 6. 올라가기 액션
            System.out.println("몸을 올리려면 1을 입력해 주세요.");
            upAction();
        } while (isSitUp);
        // 7. 등급반환
        if(0 < getCount() && getCount() < 30) return 4;
        else if(30<= getCount() && getCount() < 60) return 3;
        else if(60<= getCount() && getCount() < 90) return 2;
        else return 1;
    }
    // 내려가기
    private void sitAction() {
        while (true){
            int inputData = sc.nextInt();
            String message = (inputData == 1) ? "몸이내려왔습니다." : "바른자세를취해주세요";
            if(message.equals("몸이내려왔습니다.")) break;
        }
    }
    // 올라오기
    private void upAction() {
        int count = getCount();
        while (true) {
            int inputData = sc.nextInt();
            String message = (inputData == 1) ? "몸이올라왔습니다." : "바른자세를취해주세요.";
            if (message.equals("몸이올라왔습니다.")) {
                setCount(count + 1);
                System.out.println("현재갯수: " + getCount());
            }
        }
    }
    public SitUp setCount(int count){
        this.count = count;
        return this;
    }
    public int getCount() {
        return count;
    }
}
