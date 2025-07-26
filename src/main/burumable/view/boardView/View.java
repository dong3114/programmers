package main.burumable.view.boardView;

import main.burumable.view.ViewInfo;
import main.burumable.view.dto.BoardMatrix;

import java.util.List;

/**
 * 보드판 출력
 * 참고: https://github.com/alswn3632/202410_teamProject2_java
 */
public class View implements ViewInfo<List<List<BoardMatrix>>> {
    private static final int BOARD_SIZE = 8;    // 보드판 사이즈 8*8
    private static final int CELL_WIDTH = 12;
    @Override
    public void render(List<List<BoardMatrix>> data) {
        for (int i=0; i < BOARD_SIZE; i++) {

        }
    }

    // 각 셀당 정보
    private void printRowContent(List<List<BoardMatrix>> boardMatrix, int row) {
        for (int line = 0; line < 3; line++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                BoardMatrix cell = boardMatrix.get(row).get(col);
                String content = switch (line) {
                    case 0 -> cell.getLandName();
                    case 1 -> cell.getLandUser();
                    case 2 -> cell.getLocationUsers();
                    default -> "";
                };
                System.out.printf("│%-" + CELL_WIDTH + "s│ ", content);
            }
            System.out.println();
        }
    }

    // 각 셀당 default 레이아웃 (header)
    private void printTopBorder() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("┌" + "─".repeat(CELL_WIDTH) + "┐ ");
        }
        System.out.println();
    }
    // 각 셀당 default 레이아웃 (footer)
    private void printBottomBorder() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            System.out.print("└" + "─".repeat(CELL_WIDTH) + "┘ ");
        }
        System.out.println();
    }

}
