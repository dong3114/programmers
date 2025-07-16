package main.burumable.view;

import main.burumable.land.domain.Land;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LandView {
    public static String viewSystem(Scanner sc) {
        System.out.println("현재 위치한 땅을 구매 하시겠습니까?");
        System.out.println("1. 구매한다.    2. 땅 판매     3. 종료");
        return sc.nextLine();
    }
    // havaLands로 배열에 담긴 메세지 출력 담당
    public static void printLandMessages(List<Land> lands) {
        ViewMessage<List<Land>> landMessage = LandView::haveLands;
        List<String> result = landMessage.getMessage(lands);
        result.forEach(System.out::println);
    }

    // String 메세지를 오직 담는 행위만 함.
    private static List<String> haveLands(List<Land> lands) {
        List<String> result = new ArrayList<>();
        if(lands.isEmpty()) {
            result.add("가지고있는 땅이 없습니다.");
            return result;
        }

        for (int i = 0; i < lands.size(); i += 3) {
            Land land1 = lands.get(i);
            Land land2 = i+1 < lands.size()? lands.get(i+1) : null;
            Land land3 = i+2 < lands.size()? lands.get(i+2) : null;

            String message =  """
                땅 이름: %s        땅 이름: %s        땅 이름: %s
                땅 가격: %d    땅 가격: %d    땅 가격: %d
                """.formatted(
                    land1.getLandName(),
                    land2 != null ? land2.getLandName() : "-",
                    land3 != null ? land3.getLandName() : "-",
                    land1.getLandPrice(),
                    land2 != null ? land2.getLandPrice() : 0,
                    land3 != null ? land3.getLandPrice() : 0
            );
            result.add(message);
        }
        return result;
    }
}
