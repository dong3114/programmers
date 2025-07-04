package main.upgrade.application;

import main.upgrade.users.controller.UserController;
import main.upgrade.users.service.UserService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserController userController = new UserController(userService);
        Scanner scanner = new Scanner(System.in);
        boolean gameLoad = true;
        
        while (gameLoad) {
            System.out.println("\n액션을 선택하세요:");
            System.out.println("1. 유저 등록");
            System.out.println("2. 유저 목록 보기");
            System.out.println("3. 종료");
            System.out.print("선택: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // 입력 버퍼 클리어
            switch (choice){
                case 1 -> userController.addUser();
                case 2 -> userService.printUser();
                case 3 -> {
                    System.out.println("프로그램을 종료합니다.");
                    gameLoad = false;
                }
                case 4 -> {
                    System.out.println("잘못된 입력입니다. 다시 시도해주세요.");
                    gameLoad = false;
                }
            }
        }
        scanner.close();
    }
}
