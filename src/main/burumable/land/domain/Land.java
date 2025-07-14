package main.burumable.land.domain;

public abstract class Land {
    protected final String landName;
    protected final int landPrice;
    protected String landUserName;
    protected int landTax;

    public Land(String landName, int landPrice) {
        this.landName = landName;
        this.landPrice = landPrice;
    }
    public abstract int calculateTax();

    public void changeLandUser(String landUserName) {
        this.landUserName = landUserName;
    }

    public void setLandUserName(String landUserName) {
        this.landUserName = landUserName;
    }
}
