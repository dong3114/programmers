package main.chcek.situp;

import main.chcek.Actions;

import java.util.Queue;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
/**
 * 멤버변수
 * int 카운트
 * int 시간 제한
 * 메서드
 * private 증감에 대한 메서드
 * ps. 빌더나 메서드 체이닝 안 한 이유는 각 메서드 호출 시 setCount로 불러오는게 메모리에 여유가 있기때문
 * new 키워드로 새로 객체 생성하면 힙 영역에 불필요한 메모리를 사용할 수 있음
 */
public class SitUpImpl implements Actions {
    Scanner sc = new Scanner(System.in);
    // 회원의
    private int timeLimit;  // 밖에서 측정 시간을 입력 받을지?
    private int count;
    private boolean isSitUp;   // 기록 측정 종료임을 알리기 위한 변수

    private int suNo;
    // 여러가지 사람이 사용함에 따라 queue 자료형 구조 사용
    private static Queue<String> suLogID;

    public SitUpImpl(Builder builder){
        this.timeLimit = builder.timeLimit;
        this.count = builder.count;
        this.isSitUp = builder.isSitUp;
    }
    // timeLimit을 파라미터로 받을지 멤버 변수로 사용할지 ?
    @Override
    public int doRecording() {
        this.isSitUp = true;
        // 1. 시간 측정 객체 생성
        Timer timer = new Timer();
        // 2. 시간 측정 로직 작성
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                isSitUp = false;    // 특정시간 종료되면
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
            sitAction();
            // 6. 올라가기 액션
            upAction();
        } while (isSitUp);
        // 7. 등급반환 (메서드화)
        return getGrade(this.count);
    }
    // 내려가기
    private void sitAction() {
        while (true){
            System.out.println("몸을 내리려면 1을 입력해 주세요.");
            int inputData = sc.nextInt();
            String message = (inputData == 1) ? "몸이내려왔습니다." : "바른자세를취해주세요";
            System.out.println(message);
            if(message.equals("몸이내려왔습니다.")) break;
        }
    }
    // 올라오기
    private void upAction() {
        while (true) {
            System.out.println("몸을 올리려면 1을 입력해 주세요.");
            int inputData = sc.nextInt();
            String message = (inputData == 1) ? "몸이올라왔습니다." : "바른자세를취해주세요.";
            System.out.println(message);
            if (message.equals("몸이올라왔습니다.")) {
                setCount(getCount() + 1);
                System.out.println("현재갯수: " + getCount());
                break;
            }
        }
    }

    public int getCount() {
        return count;
    }

    private int getGrade(int count) {
        if(0 < count && count < 30) return 4;
        else if(30<= count && count < 60) return 3;
        else if(60<= count && count < 90) return 2;
        else return 1;
    }

    // 현재 클래스 내부에서만 사용 할 것
    private void setCount(int count){
        this.count = count;
    }

    // 빌더 패턴 추가
    public static class Builder {
        private int timeLimit;
        private int count;
        private boolean isSitUp;

        // 초기화시 필요한 회원 정보와 측정 시간을 초기 값으로 받기
        public Builder(int timeLimit){
            this.timeLimit = timeLimit;
            this.count = 0;
        }

        public SitUpImpl builder(){
            return new SitUpImpl(this);
        }
    }
}
