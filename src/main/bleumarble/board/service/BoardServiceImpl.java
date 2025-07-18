package main.bleumarble.board.service;

import main.bleumarble.user.domain.User;

public class BoardServiceImpl implements BoardService{
    @Override
    public User createUser(String userId, int userMoney) {
        return User.builder(userId,userMoney)
                .build();
    }
}
