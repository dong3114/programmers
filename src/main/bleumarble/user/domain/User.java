package main.bleumarble.user.domain;

import main.bleumarble.land.domain.Land;

import java.util.List;

public class User {
    private int userMoney;
    private boolean isAlive;
    private boolean isLoan;
    private  List<Land> userLands;
    private int userLocation;
    private int userTurn;

    private final String userName;

    public User(Builder builder){
        this.userName = builder.userName;
        this.userMoney = builder.userMoney;
        this.userTurn = builder.userTurn;
        this.isAlive = builder.isAlive;
        this.userLands = builder.userLands;
        this.userLocation = builder.userLocation;
    }
    // 유저의 돈의 증감
    public int subtractMoney(int money){
        this.userMoney -= money;
        return this.userMoney;
    }
    public int addMoney(int money){
        this.userMoney += money;
        return this.userMoney;
    }
    // 유저 탈락 여부 반환
    public boolean isElimination(boolean isAlive) {
        this.isAlive = isAlive;
        return this.isAlive;
    }
    public void addLand(Land land) {
        this.userLands.add(land);
    }

    public static Builder builder(String userName, int userMoney){
        return new Builder(userName, userMoney);
    }

    public static class Builder{
        private String userName;
        private int userMoney;
        private int userTurn;
        private boolean isAlive;
        private List<Land> userLands;
        private int userLocation;
        private boolean isLoan;

        public Builder(String userName, int userMoney){
            this.userName = userName;
            this.userMoney = userMoney;
            this.isAlive = true;
            this.isLoan = true;
        }

        public Builder userTurn(int userTurn) {
            this.userTurn = userTurn;
            return this;
        }
        public Builder isAlive(boolean isAlive) {
            this.isAlive = isAlive;
            return this;
        }

        public Builder userLands(List<Land> userLands) {
            this.userLands = userLands;
            return this;
        }

        public Builder userLocation(int userLocation) {
            this.userLocation = userLocation;
            return this;
        }
        public User build() {
            return new User(this);
        }
        public Builder isLoan(boolean isLoan) {
            this.isLoan = isLoan;
            return this;
        }
    }
    // getter
    public int getUserMoney() {
        return this.userMoney;
    }

    public String getUserName() {
        return this.userName;
    }

    public List<Land> getUserLands () {
        return this.userLands;
    }
}
