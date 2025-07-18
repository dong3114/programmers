package main.bleumarble.board.service;

import main.bleumarble.user.domain.User;

public interface BoardService {
    /**
     * @param userId    scanner로 입력 받을 초기 닉네임
     * @param userMoney scanner로 입력 받을 초기 money
     * @return User 초기 객체
     */
    User createUser(String userId, int userMoney);

}
