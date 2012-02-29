package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class NoDiscount implements DiscountStrategy {

    private double discountRate = 0.00;

    @Override
    public double getExtendedDiscountedAmount(double price, double qty) {
        return price * qty;
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
//    public static void main(String[] args){
//        NoDiscount nd = new NoDiscount();
////        fd.setDiscountPercent(.10);
//        double amount = nd.getDiscountAmount(10.00, 5);
//        System.out.println("the NoDiscount amount is " + amount);
//    }
//    
}
