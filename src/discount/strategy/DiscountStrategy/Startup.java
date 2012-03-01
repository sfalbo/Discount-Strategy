package discount.strategy.DiscountStrategy;

/**
 *
 * @author sfalbo
 */
public class Startup {
    public static void main(String[] args) {
        
        CashRegister cr = new CashRegister();
        
        cr.startnewSale("AS2010");
//        cr.addnewlineItem("A101", 3);
     // cr.addnewlineItem("A102", 4);
     // cr.addnewlineItem("A103", 6);
        
        
        
        cr.displayInvoice();

    
    
    }
}
