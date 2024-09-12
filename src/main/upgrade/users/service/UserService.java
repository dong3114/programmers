package main.upgrade.users.service;

import main.upgrade.users.domain.User;

import java.util.ArrayList;
import java.util.List;

// 성공, 실패 문구 출력
public class UserService {
    private List<User> users;

    public UserService() {
        this.users = new ArrayList<>();
    }

    public void printUser(){
        System.out.println("현재 등록된 유저 입니다.");
        for(int i = 0; i < this.users.size(); i++){
            System.out.println((i + 1) + ". " + this.users.get(i).getName());
        }
    }
    public void messageP(String message){
        System.out.println(message);
    }
    public void userAdd(User user){
        users.add(user);
    }

}
