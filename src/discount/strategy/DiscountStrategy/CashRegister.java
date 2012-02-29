package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class CashRegister {

    private Receipt receipt;
    private Customer ca;
//    Product pa = new ProductInArray();
    private String custID;

    void startnewSale(String custID) {

        Customer c = ca.setCustomerID(custID);

        //get the name of the Customer in String variable
        String name = c.getCustomerName();
        receipt = new Receipt(custID);
    }

    public void addnewlineItem(String productID, int qty) {

        
        LineItem item = new LineItem();
        
        //Get product information
        Product p = pa.setProductID(productID);
         
        // assign line item values
        item.setProduct(p.getProductId());
        item.setUnitCost(p.getUnitCost());
        item.setQty(qty);
        item.setDiscountAmt(p.getExtendedDiscountedAmount(qty));
        item.calcSubtotal();
        item.calcSubtotal();

        // assign each line item to receipt
        receipt.addNewLineItem(productID, qty);
        

    }
    
 
    void displayInvoice() {

        System.out.println("The Customer ID: " + custID);
        System.out.println();
        System.out.println("Product ID     Product Name     Unit Price    Quantity     Total Price");
        System.out.println("------------------------------------------------------------------------");

        System.out.println(receipt.finalizeSale());
        //rest of the invoice needs to go here.
        //I ran out of time working a lot on the temp array list.

    }

    void finalizeSale() {
        
        double grandTotal = 0;
        double totalDiscount = 0;
        
        
    }
}
