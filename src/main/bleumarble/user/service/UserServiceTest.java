package main.bleumarble.user.service;

import main.bleumarble.land.domain.GreenLine;
import main.bleumarble.land.domain.Land;
import main.bleumarble.land.domain.RedLine;
import main.bleumarble.land.domain.YellowLine;
import main.bleumarble.user.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {
    public static void main(String[] args) {
        String name = "유저1";
        Land land1 = new RedLine("부산", 100000);
        Land land2 = new YellowLine("전주", 50000);
        Land land3 = new GreenLine("부안", 10000);
        Land land4 = new RedLine("서울", 1000000);

        List<Land> lands = new ArrayList<>();
        lands.add(land1);
        lands.add(land2);
        lands.add(land3);

        User user = User.builder(name, 100000000)
                .userLands(lands)
                .build();
        UserService userService = new UserServiceImpl(user);

        // 땅구매 테스트
        System.out.println("🏠 땅 구매 테스트 시작");
        userService.buyLand(land4);

        // ✅ 결과 출력
        System.out.println("✅ 구매 땅 유저 금액: " + land4.getLandName());
        System.out.println("✅ 구매 후 유저 금액: " + user.getUserMoney());
        System.out.println("✅ 보유 땅 수: " + user.getUserLands().size());
    }
}
