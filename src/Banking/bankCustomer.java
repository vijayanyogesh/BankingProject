package Banking;

import java.util.HashSet;
import java.util.Scanner;

public class bankCustomer {

    private String name;
    private String gender;
    private int age;
    private long phoneNo;
    private String aadharNo;
    private String custId;
    private int index;

    //customerAccount custacc = new customerAccount();

    HashSet details = new HashSet();

    //Constructor - Initialize the variables
    public bankCustomer(){

        name = "New Name";
        gender = "M/F";
        age =  100;
        //this.accountNo = 123456789;
        //custId = "";

    }

    //overloaded constructor
    public bankCustomer(String name, int age, String gender, long phoneNo){

        this.age = age;
        this.gender = gender;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public bankCustomer(String new_name, int new_age, String new_gender,
                        String aadharNo, long custId, long accountNo, long balance) {


    }

    //update method
    public void updateProfile(String new_name,int new_age, String new_gender){

        name = new_name;

        age = new_age;

        gender = new_gender;

    }

    //Search for customer
    public String searchCust(String cID){

        //mainPage mp = new mainPage();

        String index1 = null;

        if(custId.equals(cID)){

            index1 = custId;

        }

        return (index1);

    }




    //Method to Display customer
    public void display(){

       System.out.println(name + age + gender + phoneNo);


    }

    public void approvedLoan(){

        //this.loanAmount = 10000;

    }

    //Method to add customer
    public void createAccount(int index) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Your name");
        name = scan.next();

        System.out.println("Enter Your age");
        age = scan.nextInt();

        System.out.println("Enter Your gender");
        gender = scan.next();

        System.out.println("Enter Your PhoneNo");
        phoneNo = scan.nextLong();

        System.out.println("Enter Aadhar Number");
        aadharNo = scan.next();

        System.out.println("Enter Cust Id");
        custId = scan.next();

        this.index = index;



    }


    //-------------------------------------------------------------------------------------------------
    //Getter and Setter Methods
    //Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }





}
