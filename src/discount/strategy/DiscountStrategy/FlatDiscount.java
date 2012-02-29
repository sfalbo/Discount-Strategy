package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class FlatDiscount implements DiscountStrategy {

    private double discountRate = 5.00;

    @Override
    public double getExtendedDiscountedAmount(double price, double qty) {

        return (price * qty) - discountRate;

    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountPercent(double discountPercent) {
        this.discountRate = discountPercent;
    }

    // for testing
    public static void main(String[] args) {
        FlatDiscount fd = new FlatDiscount();
//        fd.setDiscountPercent(.10);
        double amount = fd.getExtendedDiscountedAmount(10.00, 5);
        System.out.println("the FlatDiscount amount is " + amount);

    }
}
