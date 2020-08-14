package Banking;

import java.time.LocalDate;
import java.sql.Date;
import java.time.format.DateTimeFormatter;

public class customerTransactions extends bankCustomer {

    private long transactionId;
    private LocalDate date;
    private String date1;
    private String custIdacc;
    private long accType;
    private long accNo;
    private long acctbalance;
    private long transamount;
    private String transType;
    customerAccount custacc = new customerAccount();

    //debit method get the parameters and passes them to createTransaction
    public long custDebit(long amount,String custid,long accno,long balance,int transId){

        this.transamount = amount;
        this.transType = "Debit";

        balance = balance - amount;

        createTransaction(custid,accno,balance,transId);

        return balance;
    }
    //createTransaction method to store all the details in the object
    public void createTransaction(String custid,long accno,long balance,int transId){

        this.acctbalance = balance;
        this.accNo = accno;
        this.custIdacc = custid;
        this.transactionId = transId;

        long test = System.currentTimeMillis();
        //this.date = new Date(test);
        //System.out.println(date);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd");
        LocalDate now = LocalDate.now();
        this.date = now;
        this.date1 = dtf.format(now);
        System.out.println(dtf.format(now));

        //System.out.println("in create");
    }


    public long custCredit(long amount,String custid,long accno,long balance,int transId){

        this.transamount = amount;
        this.transType = "Credit";

        balance = balance + amount;

        createTransaction(custid,accno,balance,transId);

        return balance;

    }

    //display method to print statement details if the custid and accno match

    public void getAccountStatement(String custId,long accno){

        if((this.custIdacc).equals(custId) && (this.accNo == accno) ){

            System.out.println("Transaction Id " + this.getTransactionId() +
                    " Account No " + this.accNo + " Balance is " + this.acctbalance
                    + " " + this.transType + " " + this.transamount);


        }

    }

    //----------------------getter and setter methods------------------------------------------------

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public String getCustIdacc() {
        return custIdacc;
    }

    public void setCustIdacc(long String) {
        this.custIdacc = custIdacc ;
    }

    public long getAccType() {
        return accType;
    }

    public void setAccType(long accType) {
        this.accType = accType;
    }

}
