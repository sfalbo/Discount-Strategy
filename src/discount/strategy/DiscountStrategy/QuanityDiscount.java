package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class QuanityDiscount implements DiscountStrategy {

    private double discountRate = .10;
    private double discountAmount;

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public double getExtendedDiscountedAmount(double price, double qty) {

        discountAmount = (price * qty) * discountRate;

        if (qty >= 2) {
            return (price * qty) + discountAmount;
        }
        return price;
    }

    @Override
    public void setDiscountPercent(double discountPercent) {
        this.discountRate = discountPercent;
    }
//    public static void main(String[] args){
//        QuanityDiscount qd = new QuanityDiscount();
////        fd.setDiscountPercent(.10);
//        double amount = qd.getDiscountAmount(10.00, 1);
//        System.out.println("the Quanity Discount amount is " + amount);
//        
//    }
}
