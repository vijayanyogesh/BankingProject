package Banking;

import java.util.Date;

public class customerTransactions extends bankCustomer {

    private long transactionId;
    private Date date;
    private String custIdacc;
    private long accType;
    private long accNo;
    private long acctbalance;
    private long transamount;
    private String transType;
    customerAccount custacc = new customerAccount();

    public long custDebit(long amount,String custid,long accno,long balance,int transId){

        this.transamount = amount;
        this.transType = "Debit";

        balance = balance - amount;

        createTransaction(custid,accno,balance,transId);

        return balance;
    }

    public void createTransaction(String custid,long accno,long balance,int transId){

        this.acctbalance = balance;
        this.accNo = accno;
        this.custIdacc = custid;
        this.transactionId = transId;

        //System.out.println("in create");
    }


    public long custCredit(long amount,String custid,long accno,long balance,int transId){

        this.transamount = amount;
        this.transType = "Credit";

        balance = balance + amount;

        createTransaction(custid,accno,balance,transId);

        return balance;

    }

    public void getAccountStatement(String custId,long accno){

        if((this.custIdacc).equals(custId) && (this.accNo == accno) ){

            System.out.println("Transaction Id " + this.getTransactionId() +
                    " Account No " + this.accNo + " Balance is " + this.acctbalance
                    + " " + this.transType + " " + this.transamount);


        }

    }

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
