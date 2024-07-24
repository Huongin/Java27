package src;

import java.util.Scanner;

public class Bank {
    private static int AUTO_ID = 100;

    private int id;
    private String bankname;
    private double interestrate;

    public Bank(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public double getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(double interestrate) {
        this.interestrate = interestrate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "id=" + id +
                ", bankname='" + bankname + '\'' +
                ", interestrate=" + interestrate +
                '}';
    }

    public void inputInfo(){
        System.out.print("Nhập tên ngân hàng ");
        this.setBankname(new Scanner(System.in).nextLine());
        System.out.print("Nhập lãi suất tiền gửi: ");
        this.setInterestrate(new Scanner(System.in).nextDouble());
    }
}
