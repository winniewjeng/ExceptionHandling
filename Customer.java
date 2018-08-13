//In this project, define a customer class similar to what you defined for 
//project 5 and 6.  A Customer has a first name, last name, and social security 
//number. Define the Customer constructor so it will initialized those attributes. 

//Define an exception class called "InvalidCustomerException".  Update the Customer
//constructor to throw an exception when an invalid Social Security Number is 
//passed to the constructor. Update the main method with a try/catch block to catch
//the exception and call the getMessage() method in the catch block.
//
//InvalidCustomerException class should override the getMessage() method to return
//a string such as “Invalid SSN 5438-98-9876”.
public class Customer {

    private String firstName;
    private String lastName;
    private String ssn;
//    private InvalidCustomerException exc;

    public Customer(String FN, String LN, String Ssn) {
        firstName = FN;
        lastName = LN;
        ssn = Ssn;
    }

    public void checkSsn() throws InvalidCustomerException {

        String checkSsn = ssn;
        String[] segment = checkSsn.split("\\-");
        
        //Check (1) and (2), if the delimiters are in the right place, 
        //Check (3) if the ssn string length is exactly 11, 
        //Check (4) if numbers of delimiters is exactly 3
        if (checkSsn.charAt(3) != '-' || checkSsn.charAt(6) != '-' 
                || checkSsn.length() != 11 || segment.length != 3) {
            throw new InvalidCustomerException(ssn);
        }

        //Check if the ssn contains anything other than digit, i.e. chars
        //Notes:
        //Character.isDigit(string.charAt(index)) (JavaDoc) will return true if it's a digit
        //Character.isLetter(string.charAt(index)) (JavaDoc) will return true if it's a letter
        for (int i = 0; i < 3; i++) {
            if (Character.isDigit(segment[0].charAt(i)) == false) {
                throw new InvalidCustomerException(ssn);
            }
        }
        for (int i = 0; i < 2; i++) {
            if (Character.isDigit(segment[1].charAt(i)) == false) {
                throw new InvalidCustomerException(ssn);
            }
        }
        for (int i = 0; i < 4; i++) {
            if (Character.isDigit(segment[2].charAt(i)) == false) {
                throw new InvalidCustomerException(ssn);
            }
        }

    }

}
