package main.burumable.board.domain;

import java.util.ArrayList;

public class BoardInfo {
    private int diceNum;
    private ArrayList<String> Lands;

    // setter
    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }
    public void setLandNames(ArrayList<String> landNames) {
        Lands = landNames;
    }

    // getter
    public int getDiceNum() {
        return diceNum;
    }
    public ArrayList<String> getLandNames() {
        return Lands;
    }

}
