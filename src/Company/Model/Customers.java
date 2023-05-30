package Company.Model;

import java.time.LocalDateTime;

public class Customers {
    private int customerID;
    private String customerName;
    private String customerAddress;
    private String customerPostalCode;
    private String customerPhoneNumber;
    private int divisionID;


    public Customers(int customerID,String customerName, String customerAddress, String customerPostalCode, String customerPhoneNumber,
                         int divisionID){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPostalCode = customerPostalCode;
        this.customerPhoneNumber = customerPhoneNumber;
        this.divisionID = customerID;

    }

    public int getCustomerID(){
        return customerID;
    }
    public String getCustomerName(){
        return customerName;
    }

    public String getCustomerAddress(){
        return customerAddress;
    }

    public String getCustomerPostalCode(){
        return customerPostalCode;
    }
    public String getCustomerPhoneNumber(){
        return customerPhoneNumber;
    }

    public int getDivisionID(){
        return divisionID;
    }

}
