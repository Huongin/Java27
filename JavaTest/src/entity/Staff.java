package src.entity;

import java.util.Scanner;

public class Staff extends Person {

    private static int AUTO_ID = 1000;

    private int id;
    private String signedDate;

    public Staff (){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

    public String getSignedDate() {
        return signedDate;
    }

    public void setSignedDate(String signedDate) {
        this.signedDate = signedDate;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", signedDate='" + signedDate + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public void inputInfo(){
        super.inputInfo();
        System.out.println("Nhập ngày ký hợp đồng: ");
        this.setSignedDate(new Scanner(System.in).nextLine());
    }
}
