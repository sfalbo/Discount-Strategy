package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class LineItem {

    private String productId;
    private double qty;

    public LineItem(String productId, double qty) {
        this.productId = productId;
        this.qty = qty;
    }

            
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }
    
    public double getTotalDiscount() {
        return roundUpCents(product.getTotalDiscount(qty));
    }

    public double getLineItemTotal() {
        return roundUpCents(product.getUnitCost() * qty - getTotalDiscount());
    }
    
}