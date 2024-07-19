import src.entity.NhanVienBanHang;
import src.entity.NhanVienBanHangDetail;
import src.entity.Product;
import src.entity.Staff;

import java.util.Scanner;

public class Main {
    private static final Product[] products = new Product[1000];
    private static final Staff[] staffs = new Staff[1000];
    private static final NhanVienBanHang[] sales = new NhanVienBanHang[1000];

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        while (true) {
            printMenuOptions();
            int funtionChoice = chooseFunction();
            switch (funtionChoice) {
                case 1:
                    inputNewProduct();
                    break;
                case 2:
                    printNewProduct();
                    break;
                case 3:
                    inputNewStaff();
                    break;
                case 4:
                    printNewStaff();
                    break;
                case 5:
                    creatNhanVienBanHang();
                    break;
                case 6:
                    printNhanVienBanHang();
                    break;
                case 7:
                    System.out.println("Nhập");
                    break;
                case 8:
                    System.out.println("Nhập");
                    break;
                case 9:
                    System.out.println("Nhập");
                    return;
            }
        }
    }

    private static void printNhanVienBanHang() {
        for (int i = 0; i < sales.length ; i++) {
            if (sales[i] == null){
                continue;
            }
            System.out.println(staffs[i]);
        }
    }

    private static void creatNhanVienBanHang() {
        System.out.println("Có bao nhiêu nhân viên trong danh sách bán hàng: ");
        int staffNumber;
        while (true) {
            staffNumber = new Scanner(System.in).nextInt();
            if (staffNumber > 0 && staffNumber <= staffs.length) {
                break;
            }
            System.out.println("Số lượng nhân viên bán hàng nhập vào không hợp lệ, vui lòng nhập lại: ");
        }
        for (int i = 0; i < staffNumber; i++) {
            System.out.println("Nhập thông tin id của nhân viên bán hàng thứ " + (i + 1));
            Staff staff = truyVanNhanVien();

            NhanVienBanHangDetail[] details = khaiBaoThongTinMatHangBan();

            NhanVienBanHang sale = new NhanVienBanHang(staff, details);
            savesales(sale);
        }
    }

    private static void savesales(NhanVienBanHang sale) {
        for (int k = 0; k < sales.length ; k++) {
            if (sales[k] != null){
                continue;
            }
            sales[k] = sale;
            break;
        }
    }


    private static Staff truyVanNhanVien() {
        Staff staff = null;
        while (true){
            int staffId = new Scanner(System.in).nextInt();
            for (int j = 0; j < staffs.length ; j++) {
                if (staffs[j] != null && staffId == staffs[j].getId()) {
                    staff = staffs[j];
                    break;
                }
            }
            if(staff != null) {
                break;
            }
            System.out.println("Không có nhân viên nào mang mã id vừa nhập, Vui lòng nhập lại: ");
        }
        return staff;
    }

    private static NhanVienBanHangDetail[] khaiBaoThongTinMatHangBan() {
        System.out.println("Nhân viên này đã bán bao nhiêu mặt hàng: ");
        int soMatHang = 0;
        while (true) {
            soMatHang = new Scanner(System.in).nextInt();
            if (soMatHang > 0 && soMatHang <= products.length) {
                break;
            }
            System.out.println("Số lượng hàng đã bán không hợp lệ, Vui lòng nhập lại");
        }
        NhanVienBanHangDetail[] details = new NhanVienBanHangDetail[soMatHang];
        int count = 0;
        for (int j = 0; j < soMatHang; j++) {
            System.out.println("Nhập id của mặt hàng thứ " + (j + 1));

            Product product = null;
            while (true) {
                int productId = new Scanner(System.in).nextInt();
                for (int k = 0; k < products.length; k++) {
                    if (products[k] != null && productId == products[k].getId()) {
                        product = products[k];
                        break;
                    }
                }
                if (product != null) {
                    break;
                }
                System.out.println("Không có mã hàng nào khớp với mã vừa nhập. vui lòng nhập lại mã: ");
            }
            System.out.println("Với loại mặt hàng " + product.getProducttype() + " này nhân viên đã bán bao nhiêu hàng: ");
            int quantity = new Scanner(System.in).nextInt();
            NhanVienBanHangDetail detail = new NhanVienBanHangDetail(product, quantity);

            details[count] = detail;
            count++;
        }
        return details;
    }

    private static void printNewStaff() {
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] == null) {
                continue;
            }
            System.out.println(staffs[i]);
        }
    }

    private static void inputNewStaff() {
        System.out.print("Nhập số lượng nhân viên muốn nhập vào danh sách: ");
        int staffNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < staffNumber ; i++) {
            System.out.println("Nhập thông tin cho nhân viên thứ " + (i+1));
            Staff staff = new Staff();
            staff.inputInfo();
            savestaffs(staff);
        }
    }

    private static void savestaffs(Staff staff) {
        for (int j = 0; j < staffs.length; j++) {
            if (staffs[j] != null) {
                continue;
            }
            staffs[j] = staff;
            break;
        }
    }

    private static void printNewProduct() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                continue;
            }
            System.out.println(products[i]);
        }
    }

    private static void inputNewProduct() {
        System.out.println("Nhập số lượng hàng muốn nhập vào danh sách: ");
        int productNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < productNumber; i++) {
            System.out.println("Nhập thông tin mặt hàng thứ " + (i + 1));
            Product product = new Product();
            product.inputInfo();
            saveProduct(product);
        }
    }

    private static void saveProduct(Product product) {
        for (int j = 0; j < products.length; j++) {
            if (products[j] != null) {
                continue;
            }
            products[j] = product;
            break;
        }
    }

    private static int chooseFunction() {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 && functionChoice <= 9) {
                break;
            }
            System.out.print("Lựa chọn không hợp lê, vui lòng chọn lại: ");
        }
        return functionChoice;
    }
    private static void printMenuOptions() {
            System.out.println("======PHẦN MỀM QUẢN LÝ BÁN HÀNG======");
            System.out.println("1.Thêm danh sách mặt hàng mới.");
            System.out.println("2.Hiển thị danh sách mặt hàng đã có.");
            System.out.println("3.Thêm danh sách nhân viên mới.");
            System.out.println("4.Hiển thị danh sách nhân viên đã có.");
            System.out.println("5.Lập bảng danh sách bán hàng.");
            System.out.println("6.In danh sách bán hàng.");
            System.out.println("7.Sắp xếp danh sách bán hàng.");
            System.out.println("8.Lập bảng kê doanh thu cho mỗi nhân viên.");
            System.out.println("9.Thoát.");
    }
}


