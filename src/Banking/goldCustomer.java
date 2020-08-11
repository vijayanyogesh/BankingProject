package Banking;

public class goldCustomer extends genericCustomer {


    @Override
    public void createAcc() {

        System.out.println("Gold Account Created");
    }

    @Override
    public void setAmount() {

        System.out.println("Min Amount Set");

    }

    public void party(){

    }
}
