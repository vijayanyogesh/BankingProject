package Banking;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class mainPage {

    public static void main(String args[]){

        // Create bankcust object
        bankCustomer bankcust = new bankCustomer();

        customerTransactions custtrans = new customerTransactions();

        bankCustomer cust[] = new bankCustomer[20];

        customerAccount acct[] = new customerAccount[20];


        // Declare the option variable
        byte option1;
        byte cust_option;
        byte emp_option;

        // Create a new scanner object
        Scanner scan = new Scanner(System.in);

        int i = 0;

        int j = 0;

        do {

            System.out.println(" Welcome to SoSo Bank Select An Option \n");

            // Lets user choose between customer and employee
            System.out.println(" (1) Customer \n (2) Employee \n (3) Exit \n");

            option1 = scan.nextByte();

            //if customer option is selected goes in to here

            if (option1 == 1) {

                do {
                    byte flag = 0;
                    String cust_id;
                    long accnumber = 0;
                    do {
                        System.out.println(" Please enter your Customer ID \n");
                        cust_id = scan.next();
                        boolean found = false;

                        for (int k = 0; k < i; k++) {

                            //check if the entered custid exists if not throw error

                            found = cust[k].searchCust(cust_id);

                            if (found) {
                                System.out.println("Party time");

                                System.out.println("Enter Account Number");

                                accnumber = scan.nextLong();

                                boolean test = false;

                                //checking if cust id and acc_number exists;

                                /*for(int x = 0;x<j;x++){

                                    test = acct[x].searchAcct(cust_id,accnumber);

                                    if(test) {
                                        System.out.println("found cid and accno");
                                        accnumber = acct[x].getAcctNumber();
                                        cust_id = acct[x].getCustId();
                                        break;
                                    }

                                }*/

                                flag = 1;

                                break;
                            } else {

                                System.out.println("No Such ID enter again");
                                break;
                            }

                        }

                    }while(flag != 1);
                    System.out.println(" Select One of the Options \n ");

                    System.out.println(" (1) Withdraw \n (2) Deposit \n (3) Account Statement \n");

                    cust_option = scan.nextByte();
                    switch (cust_option) {
                        case 1:

                            //call withdraw

                            System.out.println("Enter Amount to withdraw");
                            long debit = scan.nextLong();
                            boolean test = false;

                            for(int ix = 0; ix < j;ix++){

                                test = acct[ix].searchAcct(cust_id,accnumber);

                                //System.out.println("inside for loop");

                                if(test){

                                    //get the balance for the cust_id and accnumber
                                    long balance = acct[ix].getAccBalance(cust_id,accnumber);

                                    //after deduction set the balance
                                    balance = custtrans.custDebit(debit,cust_id,accnumber,balance);

                                    //set the balance back
                                    acct[ix].setAccBalance(balance);

                                    System.out.println(acct[ix].getAccBalance() +  " " +
                                            acct[ix].getAccType());

                                    break;

                                }

                            }


                            //System.out.println("i am here");

                            //update transaction

                            break;

                        case 2:

                            //call deposit

                            //call withdraw

                            System.out.println("Enter Amount to Deposit");
                            long credit = scan.nextLong();
                            boolean test1 = false;

                            for(int ix = 0; ix < j;ix++){

                                test1 = acct[ix].searchAcct(cust_id,accnumber);

                                //System.out.println("inside for loop");

                                if(test1){

                                    long balance = acct[ix].getAccBalance(cust_id,accnumber);

                                    balance = custtrans.custCredit(credit,cust_id,accnumber,balance);

                                    acct[ix].setAccBalance(balance);

                                    System.out.println(acct[ix].getAccBalance());

                                    break;

                                }

                            }


                            break;

                        case 3:

                            //call account statement

                            break;

                        default:

                            System.out.println("Wrong Number ");

                            break;


                    }
                } while (cust_option != 4);

            } else if (option1 == 2) {



                // if employee option is selected goes into here
                do {

                    System.out.println("Please Enter your Employee ID \n");

                    System.out.println("Select One of the Options \n ");

                    System.out.println(" (1) Add Customer \n (2) Add Account to Existing Customer \n");

                    emp_option = scan.nextByte();


                    switch (emp_option) {

                        case 1:

                            cust[i] = new bankCustomer();

                            cust[i].createAccount(i);

                            cust[i].display();

                            i++;

                            System.out.println("value of i" + i);
                            //C[2].display();

                            break;


                        case 2:

                            System.out.println(" Enter Customer ID \n");

                            String cust_id = scan.next();

                            acct[j] = new customerAccount();
                            boolean found = false;

                            for(int k = 0; k < i ; k++){

                                //check if the entered custid exists if not throw error

                                found = cust[k].searchCust(cust_id);

                                if(found){
                                    System.out.println("Party time");

                                    //call addaccount method from customer account
                                    acct[j].addAccount(j,(cust[k].getCustId()));

                                    break;
                                }else{

                                    System.out.println("No Such ID enter again");
                                    break;
                                }

                            }
                            j++;
                            break;

                        default:

                            System.out.println("Wrong Details Try Again");

                            break;

                    }


                } while (emp_option != 3);

            }

        }while(option1 != 3);

        for ( int x =0 ; x < i ; x++ ){

            cust[j].display();

        }





    }

}
