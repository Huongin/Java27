package BTBuoiso8.logichandle;

import java.util.Scanner;

public class MenuLogichandle {
    private static final BookLogicHandle bookLogicHandle = new BookLogicHandle();
    private static final ReaderLogichandle readerLogichandle = new ReaderLogichandle();
    private static final BookBorrowOrderLogichandle bookBorrowOrderLogichandle = new BookBorrowOrderLogichandle(bookLogicHandle,readerLogichandle);


    public static void menu() {
        while (true) {
            printMenuOption();
            int functionChoice = chooseFunction();
            switch (functionChoice) {
                case 1:
                    bookLogicHandle.inputNewBook();
                    break;
                case 2:
                    bookLogicHandle.printBook();
                    break;
                case 3:
                    readerLogichandle.inputNewReader();
                    break;
                case 4:
                    readerLogichandle.printReaders();
                    break;
                case 5:
                    bookBorrowOrderLogichandle.creatBookBorrowOrders();
                    break;
                case 6:
                    bookBorrowOrderLogichandle.printBookBorrowOrders();
                    break;
                case 7:
                    System.out.println("Vào chức năng 7");
                    break;
                case 8:
                    bookBorrowOrderLogichandle.searchByReaderName();
                    break;
                case 9:
                    return;
            }
        }
    }

    private static int chooseFunction () {
        System.out.print("Xin mời chọn chức năng: ");
        int functionChoice;
        while (true) {
            functionChoice = new Scanner(System.in).nextInt();
            if (functionChoice >= 1 || functionChoice <= 8) {
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, uui lòng nhập lại: ");
        }
        return functionChoice;
    }

    private static void printMenuOption () {
        System.out.println("=========PHẦN MỀM QUẢN LÝ MƯỢN SÁCH THU VIỆN=========");
        System.out.println("1.Thêm mới sách vào kho.");
        System.out.println("2.Hiện thị danh sách các cuốn sách mà thư viện đang có.");
        System.out.println("3.Đăng ký tài khoản bạn đọc mới.");
        System.out.println("4.Hiển thị danh sách các bạn đọc có trong thư viện.");
        System.out.println("5.Lập bảng quản lý mượn sách");
        System.out.println("6.In danh sách lượt mượn sách");
        System.out.println("7.Sắp xếp quản lý mượn sách");
        System.out.println("8.Tim kiếm và hiển thị danh sách mượn sách theo tên bạn đọc");
        System.out.println("9.Thoát");
    }
}
