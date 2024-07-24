package src;

import java.util.Arrays;

public class SavingsBook {
    private Customer customer;
    private SavingsBookDetail[] details;
    private int totalsavingsdeposit;

    public SavingsBook(SavingsBookDetail[] details, Customer customer) {
        this.details = details;
        this.customer = customer;
    }

    public SavingsBook(Customer customer, SavingsBookDetail[] details, int totalsavingsdeposit) {
        this.customer = customer;
        this.details = details;
        this.totalsavingsdeposit =totalsavingsdeposit;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SavingsBookDetail[] getDetails() {
        return details;
    }

    public void setDetails(SavingsBookDetail[] details) {
        this.details = details;
    }

    public int getTotalsavings() {
        return totalsavingsdeposit;
    }

    public void setTotalsavings(int totalsavings) {
        this.totalsavingsdeposit = totalsavings;
    }

    @Override
    public String toString() {
        return "SavingsBook{" +
                "customer=" + customer +
                ", details=" + Arrays.toString(details) +
                ", totalsavings=" + totalsavingsdeposit +
                '}';
    }
}
