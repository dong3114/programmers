package main.burumable.view.landView;

import main.burumable.land.domain.Land;
import main.burumable.view.ViewInfo;

import java.util.List;

public class View implements ViewInfo<List<Land>> {
    @Override
    public void render(List<Land> data) {
        if(data.isEmpty()) {
            System.out.println("가지고있는 땅이 없습니다.");
            return;
        }
        for (int i = 0; i < data.size(); i += 3) {
            Land land1 = data.get(i);
            Land land2 = i+1 < data.size()? data.get(i+1) : null;
            Land land3 = i+2 < data.size()? data.get(i+2) : null;

            String message =  """
                땅 이름: %-10s | 땅 이름: %-10s | 땅 이름: %-10s
                땅 가격: %-10d | 땅 가격: %-10d | 땅 가격: %-10d
                """.formatted(
                    land1.getLandName(),
                    land2 != null ? land2.getLandName() : "-",
                    land3 != null ? land3.getLandName() : "-",
                    land1.getLandPrice(),
                    land2 != null ? land2.getLandPrice() : 0,
                    land3 != null ? land3.getLandPrice() : 0
            );
        }

        System.out.println();
    }


}
