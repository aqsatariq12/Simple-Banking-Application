package BankApplication;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.BackendData();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\n=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_= SIMPLE BANKING APPLICATION =_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=_=\n");

        BankOperation opt = new BankOperation();
        opt.checkValidity(customer);

        System.out.println("\n\t\t_-_-_-_-_-_-_-_-_-_-_-_WELCOME!_-_-_-_-_-_-_-_-_-_-_-_\n");
        while (true) {
            System.out.println("\n.............................................................\n");
            System.out.println("1: Deposite");
            System.out.println("2: Withdrawls");
            System.out.println("3: Checking Balance");
            System.out.println("4: Account Details");
            System.out.println("5: exit");
            System.out.println("\n.............................................................\n");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    opt.Deposite(customer);
                    break;
                case 2:
                    opt.Withdrawls(customer);
                    break;
                case 3:
                    opt.checkBalance(customer);
                    break;
                case 4:
                    opt.accountDetails(customer);
                    break;
                case 5:
                    System.out.println("\n Thank You!\n");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }  
    }
}
