package project_loyalty;
import java.util.Date;

public class Visit {

    private Customer customer;
    private double serviceExpense;
    private double productExpense;
    private Date date;

    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }


}