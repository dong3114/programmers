package main.burumable.board;

import java.util.ArrayList;

public class BoardInfo {
    private int diceNum;
    private ArrayList<String> LandNames;

    // setter
    public void setDiceNum(int diceNum) {
        this.diceNum = diceNum;
    }
    public void setLandNames(ArrayList<String> landNames) {
        LandNames = landNames;
    }

    // getter
    public int getDiceNum() {
        return diceNum;
    }
    public ArrayList<String> getLandNames() {
        return LandNames;
    }

}
