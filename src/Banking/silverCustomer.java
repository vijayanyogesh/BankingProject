package Banking;

public class silverCustomer extends genericCustomer {

    @Override
    public void createAcc() {

        System.out.println("Silver Account Created");
    }

    @Override
    public void setAmount() {
        System.out.println("Min Amount Set");

    }

    @Override
    public void party() {

    }
}
