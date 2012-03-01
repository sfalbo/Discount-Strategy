package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class Product {

    private String productName;
    private String productID;
    private double unitCost;
    private DiscountStrategy discountStrategy;

    public Product(String productName, String productID, double unitCost, DiscountStrategy discountStrategy) {
        this.productName = productName;
        this.productID = productID;
        this.unitCost = unitCost;
        this.discountStrategy = discountStrategy;
    }

    public double getExtendedDiscountedAmount(double qnty) {

        return discountStrategy.getExtendedDiscountedAmount(unitCost, qnty);
    }

    public DiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
//    public void getTotalDiscount(double qty){
//        DiscountStrategy ds = new DiscountStrategy();
//        double totalDiscount = 0.0;
//        for(DiscountStrategy discount : discounts) {
//            DiscountStrategy.(qty);
//            discount.setPrice(getUnitCost());
//            totalDiscount += discount.getDiscount();
//        }
//        return totalDiscount;
//        
//        
//    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public static void main(String[] args) {
        DiscountStrategy bd = new BackToSchoolDiscount();
        
    }
    
    @Override
    public String toString() {
        return productID + ", " + productName + ", " + unitCost;
    }
//        DiscountStrategy fd = new FlatDiscount();

//        qd.setDiscountPercent(.10);
//        Product pd = new Product("Shirt", 13, 15.00, qd);
//        double disnt = pd.getDiscountAmount(2);
//        System.out.println(pd);
//        System.out.println("\nSavings of: $" + disnt);

//        Product pd2 = new Product("Tshirt", "A101", 19.95, bd);
//        double disamnt = pd2.getExtendedDiscountedAmount(3);
//        System.out.println(bd);
//        System.out.println("\nTotal is: $" + disamnt);
//     
//        // do after this
//        

//        double fddis = pd2.getDiscountAmount(.22);
//        System.out.println(pd2);
//        System.out.println("/nSavings of: " + fddis);
//        
//        
//        
//        Product product = new Product("me", 12, 12.99, new FlatDiscount());
//        double discount = product.getDiscountAmount(3);
//        //System.out.println("The Discont is " + amount) ;
//        
//     
//        FlatDiscount dis = new FlatDiscount();
//        dis.setDiscountPercent(.10);
//        double amount = dis.getDiscountAmount(10.00, 30);
//        System.out.println("the discount amount is " + discount);
//        
//    }
//    
//    

    Product getProductId() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}
