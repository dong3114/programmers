package main.chcek;

public interface
Actions {
    /**
     * 사용자의 운동 자세를 측정하는 메서드입니다.
     * 측정 시간 동안 사용자로부터 1을 입력받아 카운트를 증가시키며,
     * 내부적으로 up(), down() 등의 로직을 활용해 반복 측정합니다.
     *
     * @return 측정된 사용자 운동 횟수에 기반한 최종 등급 grade
     */
    int doRecording();
}
