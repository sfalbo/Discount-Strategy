package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public interface DiscountStrategy {

    double getExtendedDiscountedAmount(double price, double qty);

    double getDiscountRate();

    void setDiscountPercent(double discountPercent);

    public void setPrice(double unitCost);
}
