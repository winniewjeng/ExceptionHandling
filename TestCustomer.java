
public class TestCustomer {
    

    public static void main(String args[]) {
        
        
        Customer aPerson = new Customer("Andy", "Warhol", "0-4-33-333!");
        
        try {
            aPerson.checkSsn();
            
        } catch (InvalidCustomerException ex) {
            System.out.println(ex.getMessage());
            
        }
        
        
    
    }
        
    
}
