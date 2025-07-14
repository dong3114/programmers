package main.burumable.land.domain;

public class YellowLine extends Land{
    private final double landRatio;

    public YellowLine(String landName, int landPrice) {
        super(landName, landPrice);
        this.landRatio = 0.3;
    }
    @Override
    public int calculateTax() {
        return (int) (landPrice*this.landRatio);
    }

}
