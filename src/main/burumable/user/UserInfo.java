package main.burumable.user;

import main.chcek.situp.SitUpImpl;

import java.util.ArrayList;

public class UserInfo {
    private int id;
    private int playerLocation;
    private int gold;
    ArrayList<String> lands = new ArrayList<>();

    public void showUserInfo() {
        System.out.println("현재유저아이디" + this.id);
        System.out.println("현재유저위치" + this.playerLocation);
        System.out.println("현재유저소지금" + this.gold);
        System.out.println("현재소지땅" + this.lands);
    }

    public int getPlayerLocation() {
        return this.playerLocation;
    }

    public UserInfo(Builder builder) {
        this.id = builder.id;
        this.playerLocation = builder.playerLocation;
        this.gold = builder.gold;
        this.lands = builder.lands;
    }

    public static class Builder{
        private int id;
        private int playerLocation;
        private int gold;
        private ArrayList<String> lands = new ArrayList<>();

        public Builder(int id){
            this.id = id;
            this.gold = 1000000;    // 초기 자금 100만원
        }

        public Builder playerLocation(int playerLocation) {
            this.playerLocation = playerLocation;
            return this;
        }

        public Builder gold(int gold) {
            this.gold = gold;
            return this;
        }

        public Builder lands(ArrayList<String> lands) {
            this.lands = lands;
            return this;
        }

        public UserInfo build(){
            return new UserInfo(this);
        }
    }

}
