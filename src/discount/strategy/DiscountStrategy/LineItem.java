package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class LineItem {

    private String productId;
    private double qty;
    private Product product;
    
    
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
    
    //I took this from your program becuase I wasn't sure how to do this.
     private double roundUpCents(double value) {
        double result = value * 100;
        result = Math.round(result);
        result = result / 100;
        return result;
    }
    
}