package discount.strategy.DiscountStrategy;

/**
 * 
 *
 * @author sfalbo
 */
public class Receipt {

    private Customer customer;
    private LineItem[] lineItems;
    private Product product;
    private LineItem[] items;
    private String finalInvoice;

    public Receipt(String custID) {

        customer = findCustomerById(custID);

    }
    private Customer[] customerDb = {
        new Customer("Abigail Sowle", "AS2010"),
        new Customer("Madison Carmella", "MC2007"),
        new Customer("Cooper Patch", "CP2006")
    };

    private Customer findCustomerById(String id) {
        Customer Customer = null;

        for (Customer c : customerDb) {
            if (id.equals(c.getCustomerID())) {
                customer = c;
                break;
            }
        }
        return customer;
    }
    
    public LineItem[] getItems() {
        return items;
    }

    public void setItems(LineItem item) {
        LineItem[] temp = new LineItem[items.length + 1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[temp.length-1] = item;
        items = temp;
        
    }

    public void addNewLineItem(String productId, double qty) {
        LineItem lineItem = new LineItem(productId, qty);
        if (lineItems == null) {
            lineItems = new LineItem[1];
            lineItems[0] = lineItem;

        } else {
            LineItem[] tempLineItems = lineItems;
            lineItems = new LineItem[tempLineItems.length + 1];
            for(int i = 0; i < tempLineItems.length; i++) {
                lineItems[i] = tempLineItems[i];
            }
            lineItems[(lineItems.length) - 1] = lineItem;

        }

    }
    
    public String getFinalInvoice(){
        return finalInvoice;
    }

    public void startNewSale(String custId) {
    }

    public double finalizeSale() {
        //loop thru line items

        double grandTotal = 0.0;
        for (LineItem l : lineItems) {
            grandTotal += l.getLineItemTotal();
        }
        return grandTotal;

    }
}
