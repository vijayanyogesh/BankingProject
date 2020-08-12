package Banking;

import java.util.Date;

public class customerTransactions extends bankCustomer {


    private long transactionId;
    private Date date;
    private String custIdacc;
    private long accType;
    private long accNo;

    customerAccount custacc = new customerAccount();

    public long custDebit(long amount,String custid,long accno,long balance){

        balance = balance - amount;

        return balance;
    }


    public long custCredit(long amount,String custid,long accno,long balance){

        balance = balance + amount;

        return balance;

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
