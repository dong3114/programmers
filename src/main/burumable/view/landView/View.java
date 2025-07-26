package main.burumable.view.landView;

import main.burumable.land.domain.Land;
import main.burumable.view.ViewInfo;

import java.util.List;

public class View implements ViewInfo<List<Land>> {
    @Override
    public void render(List<Land> lands) {
        if(lands.isEmpty()) {
            System.out.println("가지고있는 땅이 없습니다.");
            return;
        }
        for (int i = 0; i < lands.size(); i += 3) {
            Land firstItem = getItem(lands,i);
            Land secondItem = getItem(lands,i+1);
            Land thirdItem = i+2 < lands.size()? lands.get(i+2) : null;

            String message =  """
                땅 이름: %-10s | 땅 이름: %-10s | 땅 이름: %-10s
                땅 가격: %-10d | 땅 가격: %-10d | 땅 가격: %-10d
                """.formatted(
                    getName(firstItem), getName(secondItem),getName(thirdItem),
                    getPrice(firstItem), getPrice(secondItem), getPrice(thirdItem)
            );
            System.out.println(message);
        }
    }
    // 인덱스별 Land 정보 반환
    private Land getItem(List<Land> list, int index) {
        return index < list.size() ? list.get(index) : null;
    }
    // Land 이름 반환
    private String getName(Land land){
        return land != null ? land.getLandName() : "-";
    }
    // Land 가격 반환
    private int getPrice(Land land) {
        return land != null ? land.getLandPrice() : 0;
    }


}
