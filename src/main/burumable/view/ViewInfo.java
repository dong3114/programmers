package main.burumable.view;

/**
 * 정보 출력 공통 인터페이스
 */
public interface ViewInfo<T> {
    /**
     * 최종수정: 2025.07.26 한동환
     * 각 View는 이 메서드를 구현하여
     * 주어진 데이터를 기반으로 콘솔 출력 처리 할 것.
     */
    void render(T data);
}
