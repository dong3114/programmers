package main.bleumarble.view.dto;

public class BoardMatrix {
    String landName;
    String landUser;
    String locationUsers;   // 복수일때 리스트로 담아올지? String 외 x명으로 출력하고싶음

    public String getLandName() {
        return landName;
    }

    public void setLandName(String landName) {
        this.landName = landName;
    }

    public String getLandUser() {
        return landUser;
    }

    public void setLandUser(String landUser) {
        this.landUser = landUser;
    }

    public String getLocationUsers() {
        return locationUsers;
    }

    public void setLocationUsers(String locationUsers) {
        this.locationUsers = locationUsers;
    }

}
