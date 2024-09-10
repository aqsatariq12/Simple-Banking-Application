package BankApplication;
import java.util.Scanner;
import java.util.ArrayList;

public class BankOperation extends Customer{
    private String username;
    private String password;
    private Scanner sc = new Scanner(System.in);
    String permission;

    public void checkValidity(Customer customer){
        ArrayList<Customer> custList = customer.getCustomerList();
        

        System.out.println("\n------LOGIN------\n");
        System.out.print("-> User name : ");
        username = sc.nextLine();
        
        System.out.print("-> Password : ");
        password = sc.nextLine();
        
         boolean isvalid=false;
        for(Customer cust: custList){
            if(cust.getUsername().equals(username) && cust.getPassword().equals(password))
            isvalid = true;
        }
        if(isvalid){
            System.out.println("\n Login succesfully");
            return;
        }
        else{
            System.out.println("\n Invalid Username or Password");
        }
        if(isvalid == false){
            System.out.print("\n login again? y/n : ");
            permission = sc.next();
            sc.nextLine();
        while (true) {
                if (permission.equals("y") || permission.equals("yes")){
                checkValidity(customer);
                break;
                }
                else{
                    System.exit(0);
                }
            }
        }
    }

    public void Deposite(Customer customer){
        ArrayList<Customer> custList = customer.getCustomerList();
        float depAmount;
        float currAmount;
        float total;
        for(Customer cust: custList){
            if(cust.getUsername().equals(username)&& cust.getPassword().equals(password)){
                System.out.print("\t-> Enter Deposite Amount in doller = ");
                depAmount = sc.nextFloat();

                currAmount = cust.getBalance();
                
                total=depAmount+currAmount;
                cust.setBalance(total);

                System.out.println("\t   Successfully Deposited "+depAmount+" $");

            }
        }
    }

    public void Withdrawls(Customer customer){
        ArrayList<Customer> custList = customer.getCustomerList();
        float drawlAmount;
        float currAmount;
        float balance;
        for(Customer cust: custList){
            if(cust.getUsername().equals(username)&& cust.getPassword().equals(password)){
                System.out.print("\t-> Enter Withdrawl Amount in doller = ");
                drawlAmount = sc.nextFloat();
                currAmount = cust.getBalance();

                if(drawlAmount<=currAmount){
                    balance = currAmount - drawlAmount;
                    cust.setBalance(balance);
                    System.out.println("\t   Successfully Withdrew "+drawlAmount+" $");
                }
                else{
                    System.out.println("\t  Oops! Insufficient Balance");
                }
            }
        }
    }
    public void checkBalance(Customer customer){
        ArrayList<Customer> custList = customer.getCustomerList();
        float balance;
        for(Customer cust: custList){
            if(cust.getUsername().equals(username)&& cust.getPassword().equals(password)){
                balance = cust.getBalance();
                System.out.print("Your Current Balance = "+balance+" $");
            }
        }
    }
    public void accountDetails(Customer customer){
        ArrayList<Customer> custList = customer.getCustomerList();
        for(Customer cust: custList){
            if(cust.getUsername().equals(username)&& cust.getPassword().equals(password)){
                System.out.println("\n\t\t------------Your Account Details------------\n");
                System.out.println("\t\t\tName = "+cust.getUsername());
                System.out.println("\t\t\tPassword = "+cust.getPassword());
                System.out.println("\t\t\tCurrent Balance = "+cust.getBalance()+" $");
                System.out.println("\n\t\t-------------------------------------------");
            }
        }
    }
}
