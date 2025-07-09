package main.burumable.board;

import java.util.ArrayList;

public class Board {
    private BoardInfo boardInfo;

    public int rollDice() {
        double random = Math.random();
        return (int)(random*6);
    }
    public String getLandNames(int idxNumber) {
        ArrayList<String> landArray = boardInfo.getLandNames();
        return landArray.isEmpty()? landArray.get(idxNumber) : "해당지역에는땅이없습니다.";
    }
    public Integer getLandNamesLen() {
        return !boardInfo.getLandNames().isEmpty() ? boardInfo.getLandNames().size() : null;
    }
}
