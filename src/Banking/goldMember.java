package Banking;

public class goldMember extends bankCustomer {

    public double loanLimit;
    public String accountName;
    public int rewardPoints;


    public goldMember(){

        this.accountName = "Super Gold";
        this.loanLimit = 1000000;
        this.rewardPoints = 5000;

    }

    /*@Override
    public void approvedLoan() {
        super.setLoanAmount(400000);
    }*/

    public static void main(String[] args){

        goldMember gold = new goldMember();

        System.out.println(gold.accountName);
        System.out.println(gold.loanLimit);
        System.out.println(gold.getAge());
        System.out.println(gold.getGender());
        System.out.println(gold.getName());
        System.out.println(gold.rewardPoints + "\n");

        gold.updateProfile("Agent",34,"Male");

        System.out.println(gold.accountName);
        System.out.println(gold.loanLimit);
        System.out.println(gold.getAge());
        System.out.println(gold.getGender());
        System.out.println(gold.getName());
        System.out.println(gold.rewardPoints);

        //gold.approvedLoan();

        System.out.println("Loan Amount " );



    }


}
