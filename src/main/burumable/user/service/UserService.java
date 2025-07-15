package main.burumable.user.service;

import main.burumable.land.domain.Land;

public interface UserService {
    /**
     * 유저가 땅을 구매하는 행위.
     *
     * <p>행동 흐름:</p>
     * <ol>
     *   <li>현재 땅의 구매 여부 확인</li>
     *   <li>유저에게 구매 여부 질의</li>
     *   <li>구매 시: 소유 리스트(userLands)에 추가, 금액 차감</li>
     *   <li>자금 부족 시: sellLand()를 통해 땅 판매 유도</li>
     *   <li>구매 또는 종료를 선택하면 메서드 종료</li>
     * </ol>
     */
    void buyLand(Land land);

    /**
     * 유저가 소유 중인 땅을 판매하는 행위.
     *
     * <p>행동 흐름:</p>
     * <ul>
     *   <li>소유 땅 목록을 번호로 보여줌</li>
     *   <li>입력한 번호의 땅을 선택하여 판매</li>
     *   <li>중복 판매 가능, 종료 키워드 입력 시 반복 종료</li>
     * </ul>
     *
     * <p>※ LinkedList 사용 권장 (삭제 성능 고려)</p>
     */
    boolean sellLand();

    /**
     * 세금을 은행에 납부하는 행위.
     *
     * @return true  납부 성공 (user.isArrive = true)
     *         false 납부 실패 (땅을 모두 팔아도 자금 부족 → user.isArrive = false)
     */
    boolean payTax();

    /**
     * 타 유저에게 통행료를 납부하는 행위.
     *
     * @return true  납부 성공 (user.isArrive = true)
     *         false 납부 실패 (자산 부족 → user.isArrive = false)
     */
    boolean payToll();

    /**
     * 통행료 받는 메서드
     */
    void receiveToll();

    /**
     *
     */
    void takeLoan();

}
