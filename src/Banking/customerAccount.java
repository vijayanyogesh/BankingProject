package Banking;

import java.util.Scanner;

public class customerAccount extends bankCustomer {

    private String accType;
    private long accBalance;
    private long acctNumber;
    private String custId;
    private int index;



    public void addAccount(int index,String custid){

        custId = custid;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Account Type");
        accType = scan.next();

        System.out.println("Enter Account Starting Balance");
        accBalance = scan.nextLong();

        System.out.println("Generate New Account Number");
        acctNumber = scan.nextLong();

        this.index = index;

    }


    public boolean searchAcct(String cID,long acctNum){

        //mainPage mp = new mainPage();

        String index1 = null;

        if(custId.equals(cID) && (acctNumber == acctNum) ){

            return (true);

        }

        return (false);

    }

    //return balance overloaded method
    public long getAccBalance(String cID,long acctNum) {

        if(custId.equals(cID) && (acctNumber == acctNum) ){

            return (accBalance);

        }


        return 0;
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
