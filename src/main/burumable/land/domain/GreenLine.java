package main.burumable.land.domain;

public class GreenLine extends Land{
    private final double landRatio;

    public GreenLine(String landName, int landPrice) {
        super(landName, landPrice);
        this.landRatio = 0.2;
    }
    @Override
    public int calculateTax() {
        return (int) (landPrice*this.landRatio);
    }
}
