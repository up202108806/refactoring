package pt.up.fe.ldts.example3;

public class FixedDiscount implements Discount{
    private final double fixed;
    public FixedDiscount(double percentage) {
        this.fixed = percentage;
    }
    @Override
    public double applyDiscount(double price) {
        return price - fixed;
    }
}