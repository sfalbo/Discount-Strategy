package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class LineItem {

    private String productId;
    private String prodDesc;
    private int qty;
    private double unitCost;
    private double itemTotal;
    private double discountAmt;
    private double subtotal;

    LineItem() {
   
    }

    public double getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(double itemTotal) {
        this.itemTotal = itemTotal;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public Product[] getProductDb() {
        return productDb;
    }

    public void setProductDb(Product[] productDb) {
        this.productDb = productDb;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    
    private Product product;
    private Product[] productDb = {
        new Product("Tshirt", "A101", 19.95, new QuanityDiscount()),
        new Product("Earrings", "B101", 25.95, new NoDiscount()),
        new Product("Washclothes", "C101", 9.25, new FlatDiscount())
    };

    public LineItem(String productId, int qty) {
        this.productId = productId;
        this.qty = qty;
        product = findProductById(productId);
    }

    public String getLineItemData() {
        return getProductId() + "    " + getName();
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    private String getProductId() {
        return product.getProductID();
    }

    private String getName() {
        return product.getProductName();
    }

    private Product findProductById(String id) {
        Product product = null;

        for (Product p : productDb) {
            if (id.equals(p.getProductID())) {
                product = p;
                break;
            }
        }
        return product;
    }

    public double getExtendedDiscountedAmount() {
        return product.getExtendedDiscountedAmount(qty);
    } 
    
    public final void calcSubtotal() {
        subtotal = (itemTotal - discountAmt);
    }
}
