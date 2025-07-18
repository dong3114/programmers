package main.bleumarble.land.domain;

public class RedLine extends Land{
    private final double landRatio;

    public RedLine(String landName, int landPrice) {
        super(landName, landPrice);
        this.landRatio = 0.2;
    }
    @Override
    public int calculateTax() {
        return (int) (landPrice*this.landRatio);
    }
}
