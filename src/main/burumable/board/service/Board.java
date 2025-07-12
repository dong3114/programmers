package main.burumable.board.service;

import main.burumable.board.domain.BoardInfo;

import java.util.ArrayList;

public class Board {
    private BoardInfo boardInfo;


    public int rollDice() {
        double random = Math.random();
        return (int)(random*6) + 1;
    }
    // 이동 위치의 이름 반환
    public String getLandNames(int idxNumber) {
        ArrayList<String> landArray = boardInfo.getLandNames();
        return !landArray.isEmpty()? landArray.get(idxNumber) : "해당지역에는땅이없습니다.";
    }
    // 이동 지역의 인덱스 넘버 반환
    public Integer getLandNamesLen() {
        return !boardInfo.getLandNames().isEmpty() ? boardInfo.getLandNames().size() : 0;
    }
}
