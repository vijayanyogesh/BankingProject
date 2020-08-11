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

        bankCustomer C[] = new bankCustomer[20];

        customerAccount a[] = new customerAccount[20];


        // Declare the option variable
        byte option1;
        byte cust_option;
        byte emp_option;

        // Create a new scanner object
        Scanner scan = new Scanner(System.in);

        do {

            System.out.println(" Welcome to SoSo Bank Select An Option \n");

            // Lets user choose between customer and employee
            System.out.println(" (1) Customer \n (2) Employee \n (3) Exit \n");

            option1 = scan.nextByte();

            //if customer option is selected goes in to here

            if (option1 == 1) {

                int i =0;

                do {
                    System.out.println(" Please enter your Customer ID \n");

                    int cust_id = scan.nextInt();



                    System.out.println(" Select One of the Options \n ");

                    System.out.println(" (1) Withdraw \n (2) Deposit \n (3) Account Statement \n");

                    cust_option = scan.nextByte();
                    switch (cust_option) {
                        case 1:

                            //call withdraw

                            long debit = scan.nextLong();

                            custtrans.custDebit(debit);
                            //update transaction

                            break;

                        case 2:

                            //call deposit
                            long credit = scan.nextLong();

                            custtrans.custCredit(credit);


                            //update transaction

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

                int i = 0;

                int j = 0;

                // if employee option is selected goes into here
                do {

                    System.out.println("Please Enter your Employee ID \n");

                    System.out.println("Select One of the Options \n ");

                    System.out.println(" (1) Add Customer \n (2) Add Account to Existing Customer \n");

                    emp_option = scan.nextByte();


                    switch (emp_option) {

                        case 1:

                            C[i] = new bankCustomer();

                            C[i].createAccount(i);

                            C[i].display();

                            i++;

                            System.out.println("value of i" + i);
                            //C[2].display();

                            break;


                        case 2:

                            System.out.println(" Enter Customer ID \n");

                            String cust_id = scan.next();

                            a[j] = new customerAccount();

                            //call addaccount method from customer account

                            //String cid = C[j]

                            a[j].addAccount(j,cust_id);

                            System.out.println(bankcust.searchCust(cust_id));

                            a[j].displayAccount();


                            break;

                        default:

                            System.out.println("Wrong Details Try Again");

                            break;

                    }


                } while (emp_option != 3);

            }

        }while(option1 != 3);

        for ( int j =0 ; j < C.length ; j++ ){

            C[j].display();

        }





    }

}
