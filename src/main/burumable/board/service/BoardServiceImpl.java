package main.burumable.board.service;

import main.burumable.board.domain.Board;
import main.burumable.user.domain.User;

public class BoardServiceImpl implements BoardService{
    @Override
    public User createUser(String userId, int userMoney) {
        return User.builder(userId,userMoney)
                .build();
    }
}
