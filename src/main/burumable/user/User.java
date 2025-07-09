package main.burumable.user;

import main.burumable.board.Board;

import java.util.Scanner;

public class User {
    Scanner sc = new Scanner(System.in);
    private UserInfo userInfo;
    private Board board;

    public User(UserInfo userInfo, Board board) {
        this.userInfo = userInfo;
        this.board = board;
    }

    // 사용자 생성
    public UserInfo createUser(){
        System.out.println("유저 숫자를 입력하세요.");
        int inputData = sc.nextInt();
        return new UserInfo.Builder(inputData)
                                    .lands(null)
                                    .playerLocation(0)
                                    .build();
    }
    // 주사위 굴리기
    private String getLocationByDice(){
        int currentLocation = userInfo.getPlayerLocation();
        int diceNumber = board.rollDice();
        int sum = currentLocation+diceNumber;
        if(sum > board.getLandNamesLen()) {
            diceNumber = sum - board.getLandNamesLen();
        }
        return board.getLandNames(diceNumber);
    }
}
