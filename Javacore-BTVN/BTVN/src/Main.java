package src;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Customer[] customers = new Customer[1000];
    private static Bank[] banks = new Bank[100];
    private static final SavingsBook[] savingsBooks = new SavingsBook[1000];
    private static final String DATAFILE = "D:/OneDrive/Java27/Javacore-BTVN/BTVN/customer";
    private static final String BankFile = "D:/OneDrive/Java27/Javacore-BTVN/BTVN/bank";

    public static void main(String[] args) throws IOException {
        menu();
        CustomerData();
        BankData();

    }

    private static void menu() {
        while (true) {
            printMenuOptions();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    inputCustomer();
                    break;
                case 2:
                    printCustomers();
                    break;
                case 3:
                    inputNewBank();
                    break;
                case 4:
                    printNewBank();
                    break;
                case 5:
                    CreatSavingsBook();
                    break;
                case 6:
                    System.out.println("Nhập chức năng");
                    break;
                case 7:
                    System.out.println("Nhập chức năng");
                    break;
                case 8:
                    System.out.println("Nhập chức năng");
                    break;
                case 9:
                    return;
            }
        }
    }

    private static void CreatSavingsBook() {
        boolean coKhachHangHayChua = false;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] != null) {
                coKhachHangHayChua = true;
                break;
            }
        }
        boolean coTenNganHangHayChua = false;
        for (int i = 0; i < banks.length; i++) {
            if (banks[i] != null) {
                coTenNganHangHayChua = true;
                break;
            }
        }
        if (!coKhachHangHayChua || !coTenNganHangHayChua) {
            System.out.println("Chua co du lieu cua khach hang hoac ten ngan hang de thuc hien, vui long nhap lai thong tin: ");
            return;
        }
        System.out.println("Co bao nhieu khach hang da gui tien tiet kiem: ");
        int khNumber;
        while (true) {
            khNumber = new Scanner(System.in).nextInt();
            if (khNumber > 0 && khNumber <= customers.length) {
                break;
            }
            System.out.println("So luong khach hang khong hop le, vui long nhap lai: ");
        }
        for (int i = 0; i < khNumber; i++) {
            System.out.println("Nhap thong tin cua id cua khach hang thu " + (i + 1));
            Customer kh = truyVanKhachHang();
            SavingsBookDetail[] details = khaiBaoThongTinSoTietKiem();
            SavingsBook savingsBook = new SavingsBook(customer, details);

            savesavingsBooks(savingsBook);
        }
    }

    private static SavingsBookDetail[] khaiBaoThongTinSoTietKiem() {
        System.out.println("Khách hàng đã mở bao nhiêu sổ: ");
        int savingsbookquantity = 0;
        while (true) {
            savingsbookquantity = new Scanner(System.in).nextInt();
            if (savingsbookquantity< 0 && savingsbookquantity <= banks.length) {
                break;
            }
            System.out.println("Số lượng sổ không hợp lệ, vui lòng nhập lại: ");
        }
        SavingsBookDetail[] details = new SavingsBookDetail[savingsbookquantity];
        int count = 0;
        for (int j = 0; j < savingsbookquantity ; j++) {
            System.out.println("Nhập id của sổ tiết kiệm thứ: " + (j + 1) + ":");
            Bank bank = null;
            while (true)

        }
    }

    private static Customer truyVanKhachHang() {
        Customer kh = null;
        while (true) {
            int customerId = new Scanner(System.in).nextInt();
            for (int j = 0; j < customers.length; j++) {
                if (customers[j] != null && customerId == customers[j].getId()) {
                    kh = customers[j];
                    break;
                }
            }
            if (kh != null) {
                break;
            }
            System.out.println("Khong co khach hang nao mang ma vua nhap, vui long nhap lai: ");
        }
        return kh;
    }


    private static void printNewBank() {
        for (Bank bank : banks) {
            if (bank != null) {
                System.out.println(bank);
            }
        }
    }

    private static void inputNewBank() {
        int bankNumber = -1;
        while (bankNumber < 0) {
            try {
                System.out.println("Nhập số lượng ngân hàng muốn nhập vào danh sách: ");
                bankNumber = new Scanner(System.in).nextInt();
                if (bankNumber < 0) {
                    System.out.println("Số lượng ngân hàng không được âm, vui lòng nhập lại: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Số lượng ngân hàng không được âm, vui lòng nhập lại: ");
            }
        }
        for (int i = 0; i < bankNumber; i++) {
            System.out.println("Nhập thông tin cho ngân hàng thứ " + (i + 1));
            Bank bank = new Bank();
            bank.inputInfo();
            banks[i] = bank;
            saveBank(bank);
        }
    }

    private static void saveBank(Bank bank) {
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("BankData"));
            obj.writeObject(banks);
        }catch (IOException e) {
            System.out.println("Loi khi luu du lieu" + e.getMessage());
        }
    }

    private static void BankData() {
        try{
            ObjectInputStream input= new ObjectInputStream(new FileInputStream("BankData"));
            banks = (Bank[])input.readObject();
            input.close();
            System.out.println("Dữ liệu đã tải thành công");
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Lỗi khi tải dữ liệu: " + e.getMessage());
        }
    }

    private static void printCustomers() {
        for (Customer customer : customers) {
            if (customer != null) {
                System.out.println(customer);
            }
        }
    }


    private static void inputCustomer() {
        int khNumber = -1;
        while (khNumber < 0) {
            try {
                System.out.println("Nhập số lượng khách hàng muốn nhập vào danh sách: ");
                khNumber = new Scanner(System.in).nextInt();
                if (khNumber < 0) {
                    System.out.println("Số lượng khách hàng không được âm, vui lòng nhập lại: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Số lượng khách hàng không được âm, vui lòng nhập lại: ");
            }
        }
        for (int i = 0; i < khNumber; i++) {
            System.out.println("Nhập thông tin cho khách hàng thứ " + (i + 1));
            Customer kh = new Customer();
            kh.inputInfo();
            customers[i]=kh;
            saveCustomers(kh);
        }
    }
    private static void saveCustomers(Customer kh) {
        try {
            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("DATAFILE"));
            obj.writeObject(customers);
        } catch (IOException e) {
            System.out.println("Loi khi luu du lieu" + e.getMessage());
        }
    }


    private static void CustomerData() {
        try{
            ObjectInputStream input= new ObjectInputStream(new FileInputStream("DATAFILE"));
            customers = (Customer[])input.readObject();
            input.close();
            System.out.println("Dữ liệu đã tải thành công");
        } catch (ClassNotFoundException | IOException e) {
            System.out.println("Lỗi khi tải dữ liệu: " + e.getMessage());
        }
    }


    private static int chooseFunction() {
        System.out.println("Xin mời chọn chức năng: ");
        int functionChoice;
        while (true) {
            try {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice >= 1 && functionChoice <= 9) {
                    break;
                }
                System.out.println("Lua chọn là 1 số nguyên trong khoảng từ 1 đến 9, vui lòng chọn lại: ");
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn phải là số nguyên, vui lòng nhập lại: ");
            }
        }
        return functionChoice;
    }


    private static void printMenuOptions(){
        System.out.println("======PHẦN MỀM QUẢN LÝ SỔ TIẾT KIỆM CỦA KHÁCH HÀNG");
        System.out.println("1.Thêm danh sách khách hàng");
        System.out.println("2.Hiển thị danh sách khách hàng đã có");
        System.out.println("3.Thêm danh sách ngân hàng");
        System.out.println("4.Hiển thị danh sách ngân hàng đã có");
        System.out.println("5.Nhập danh sách sổ tiết kiệm của mỗi khách hàng đã có");
        System.out.println("6.Hiển thị danh sách đã lưu ");
        System.out.println("7.Sắp xếp danh sách sổ tiết kiệm");
        System.out.println("8.Lập bảng kê tổng số tiền gửi của mỗi khách hàng");
        System.out.println("9.Thoát");
    }
}

