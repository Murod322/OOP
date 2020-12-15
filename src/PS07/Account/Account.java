//package PS07.Account;

public class Account extends Customer{
    private int id;
    private Customer customer;
    private double balance =0.0;

    public Account(int id, Customer customer, double balance) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        super(customer.getID(), customer.getName(), customer.getGender());
        this.id = id;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return String.format("%s(%d) balance=$%.2f",customer.getName(),customer.getID(),balance);
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else{
            System.out.println("amount withdrawn exceeds the current balance!");
        }
    }

}