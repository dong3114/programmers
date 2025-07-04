package main.upgrade.users.controller;

import main.upgrade.users.domain.User;
import main.upgrade.users.service.UserService;

import java.util.Scanner;

public class UserController {
    private Scanner scanner;
    private UserService userService;

    public UserController(UserService userService){
        this.scanner = new Scanner(System.in);
        this.userService = userService;
    }
    public void addUser(){
        userService.messageP("이름을 입력하시오.");
        String name = scanner.next();
        int money = 5000;
        User user = new User(name, money);
        userService.userAdd(user);

        System.out.println(user.getName() + "님이 추가되었습니다");
        System.out.println("소지금: " + user.getMoney() + " 원");

        scanner.close();
    }

}
