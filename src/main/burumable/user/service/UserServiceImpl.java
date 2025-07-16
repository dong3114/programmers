package main.burumable.user.service;

import static main.burumable.utils.Utils.*;
import static main.burumable.view.LandView.*;

import main.burumable.land.domain.Land;
import main.burumable.user.domain.User;

import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService{
    private Scanner sc = new Scanner(System.in);
    private final User user;

    public UserServiceImpl(User user){
        this.user = user;
    }

    @Override
    public void buyLand(Land land) {
        boolean isComplete = false;
        do{
            String userInput = viewSystem(sc);
            int choice= safeParseInteger(userInput);
            isComplete = handleNumber(choice, land);
        } while (!isComplete);
    }

    @Override
    public boolean sellLand() {
        User user = this.user;
        List<Land> userLands = user.getUserLands();
        // 1. 땅 정보 보여주기
        printLandMessages(userLands);
        // 2. 객체 선택해서 팔기

        // 3. 유저 money 업데이트
        for(Land item : userLands) {
            
        }
        return false;
    }

    @Override
    public boolean payTax() {
        return false;
    }

    @Override
    public boolean payToll() {
        return false;
    }

    @Override
    public void receiveToll() {

    }

    @Override
    public void takeLoan() {

    }

    private boolean checkBuyLand(Land land) {
        if(user.getUserMoney() >= land.getLandPrice()){
            // 1. land 객체 상태 update
            land.setLandUserName(user.getUserName());
            // 2. 유저 소지금 감소
            user.subtractMoney(land.getLandPrice());
            // 3. 유저 보유 land update
            user.addLand(land);
            System.out.println("구매 완료!");
            return true;
        } else {
            System.out.println("잔액이 부족합니다.");
            return false;
        }
    }

    private boolean handleNumber(int choice, Land land) {
        return switch (choice) {
            case 1 -> checkBuyLand(land);
            case 2 -> sellLand();
            case 3 -> {
                System.out.println("구매를 종료합니다.");
                yield true;
            }
            default -> {
                System.out.println("제대로 입력하세요.");
                yield false;
            }
        };
    }

}
