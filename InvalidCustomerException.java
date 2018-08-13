
public class InvalidCustomerException extends Exception {
    
    private String Ssn;
    
    public InvalidCustomerException(String ssn) {
        this.Ssn = ssn;
    }
    
    @Override
    public String getMessage() {
    
    return "invlid SSN " + Ssn;
    
    }  
}
