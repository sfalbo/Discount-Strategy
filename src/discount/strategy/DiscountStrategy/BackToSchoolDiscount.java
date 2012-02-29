package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class BackToSchoolDiscount implements DiscountStrategy{
    
    private double discountRate = .30;
    private double discountPrice;
    private double discountAmount;
    
    @Override
     public double getExtendedDiscountedAmount(double price, double qty){
        
        discountPrice = (price * qty) * discountRate;
        
        
            return (price * qty) - discountPrice;
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
//        BackToSchoolDiscount btsd = new BackToSchoolDiscount();
////        fd.setDiscountPercent(.10);
//        double amount = btsd.getDiscountAmount(10.00, 5);
//        System.out.println("The Back To School Discount amount is " + amount);
//    }
//    
    
    
    
}
