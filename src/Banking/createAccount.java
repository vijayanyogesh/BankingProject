package Banking;


import java.util.Scanner;

public class createAccount {

    public static void main(String[] args){

        genericCustomer gc = new goldCustomer();

        customerCreate crt = new customerCreate();

        crt.createCust(gc);

        Scanner sc = new Scanner(System.in);

        String name = sc.next();


        createAccount create = new createAccount();



    }








}