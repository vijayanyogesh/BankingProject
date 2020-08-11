package Banking;

import java.util.Scanner;

public class customerAccount extends bankCustomer {

    private String accType;
    private long accBalance;
    private long acctNumber;
    private String custId;
    private int index;



    public void addAccount(int index,String custid){

        custId = searchCust(custid);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Account Type");
        accType = scan.next();

        System.out.println("Enter Account Balance");
        accBalance = scan.nextLong();

        System.out.println("Enter Account Number");
        acctNumber = scan.nextLong();

        this.index = index;

    }



    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public long getAccBalance() {
        return accBalance;
    }

    public void setAccBalance(long accBalance) {
        this.accBalance = accBalance;
    }

    public long getAcctNumber() {
        return acctNumber;
    }

    public void setAcctNumber(long acctNumber) {
        this.acctNumber = acctNumber;
    }

    public void addAccount(){



    }


    public void displayAccount() {

        System.out.println(custId + accType + acctNumber +accBalance+index);


    }
}
