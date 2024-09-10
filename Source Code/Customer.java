package BankApplication;
import java.util.ArrayList;

public class Customer {
    private String username;
    private String password;
    private float balance;
    protected ArrayList<Customer> cust = new ArrayList<>();
    Customer(){}
    Customer(String username, String password, float balance){
        this.username = username;
        this.password= password;
        this.balance=balance;
    }
    public void setUsername(String uname){
        this.username = uname;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String pass){
        this.password = pass;
    }
    public String getPassword(){
        return password;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
    public float getBalance(){
        return balance;
    }
    
    public ArrayList<Customer> getCustomerList(){
        return cust;
    }
    
        //You can also feth data from database
    public void BackendData(){
        cust.add(new Customer("Aqsa","aqsa123",10));
        cust.add(new Customer("Laiba","11laiba",500052));
        cust.add(new Customer("Saad","saad150",100));
        cust.add(new Customer("Hamza","hamza1122",250));
    }

        // This display function is used by Administrator to see all the account holder-->not used in this project
    // public void display(){
    //     int count = 0;
    //     for (Customer customer : cust){
    //         System.out.println("-----Record-----"+(++count));
    //         System.out.println("Name = "+customer.getUsername());
    //         System.out.println("Password = "+customer.getPassword());
    //         System.out.println("current balance = "+customer.getbalance());

    //     }
    // }
    
}
