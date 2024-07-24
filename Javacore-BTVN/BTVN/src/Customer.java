package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer {
    private static int AUTO_ID = 10000;

    protected int id;
    protected String name;
    protected String address;
    protected String phone;
    protected CustomerStyle stype;

    public Customer(){
        this.id = AUTO_ID;
        AUTO_ID++;
    }

    public int getId() {
        return id;
    }

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

    public CustomerStyle getStype() {
        return stype;
    }

    public void setStype(CustomerStyle stype) {
        this.stype = stype;
    }

    public void inputInfo(){
        System.out.print("Nhập họ và tên: ");
        this.setName(new Scanner(System.in).nextLine());
        System.out.print("Nhập địa chỉ: ");
        this.setAddress(new Scanner(System.in).nextLine());
        System.out.print("Nhập số điện thoại: ");
        this.setPhone(new Scanner(System.in).nextLine());
        System.out.println("Chọn loại khách hàng ");
        System.out.println("1.Cá nhân");
        System.out.println("2.Tập thể");
        System.out.println("3.Doanh nghiệp");
        int customerType;
        while (true) {
            try {
                customerType = new Scanner(System.in).nextInt();
                if (customerType >= 1 && customerType <= 3) {
                    break;
                }
                System.out.println("Lựa chọn phải là số nguyên từ 1 đến 3, Vui lòng chọn lại: ");
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn phải là số nguyên, vui lòng nhập lại: ");
            }
        }
        switch (customerType) {
            case 1:
                this.setStype(CustomerStyle.CN);
                break;
            case 2:
                this.setStype(CustomerStyle.TT);
                break;
            case 3:
                this.setStype(CustomerStyle.DN);
                break;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", stype=" + stype.getValue()+
                '}';
    }
}

