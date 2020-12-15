//package PS07.Invoice;

public class Invoice extends Customer{
    private int ID;
    private Customer customer;
    private double amount;

    public Invoice(int ID, Customer customer,double amount) {
        super(customer.getID(), customer.getName(), customer.getDiscount());
        this.ID = ID;
        this.customer = customer;
        this.amount = amount;
    }

    @Override
    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public double getAmountAfterDiscount(){
        double ds = getCustomer().getDiscount();
        double AAD = amount-(amount*(ds/100));
        return AAD;
    }
}
