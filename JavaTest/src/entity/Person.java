package src.entity;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputInfo(){
        System.out.println("Nhập họ và tên của nhân viên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ của nhân viên: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.println("Nhập số điện thoại của nhân viên: ");
        this.setPhone(new Scanner(System.in).nextLine());
    }
}
