package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class Customer {

    private String customerName;
    private String customerID;

    public Customer(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerID = customerID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public String toString() {
        return customerName + "\n"
                + "Account No: " + customerID;
    }
}
