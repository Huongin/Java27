package BTBuoiso8.logichandle;

import BTBuoiso8.entity.Book;
import BTBuoiso8.entity.BookBorrowOrder;
import BTBuoiso8.entity.BookBorrowOrderDetail;
import BTBuoiso8.entity.Reader;

import java.util.Scanner;

public class BookBorrowOrderLogichandle {

    private final BookBorrowOrder[] orders = new BookBorrowOrder[1000];// Danh sách lượt mượn sách

    //Dependency ịnjection
    private final BookLogicHandle bookLogicHandle;
    private final ReaderLogichandle readerLogichandle;

    public BookBorrowOrderLogichandle(BookLogicHandle bookLogicHandle, ReaderLogichandle readerLogichandle) {
        this.bookLogicHandle = bookLogicHandle;
        this.readerLogichandle = readerLogichandle;
    }

    public void printBookBorrowOrders(){
//        for (int i = 0; i < orders.length; i++) {
//            if (orders[i] == null){
//                continue;
//            }
//            System.out.println(orders[i]);
        for (BookBorrowOrder order : orders){
            if (order == null){
                continue;
            }
            System.out.println(order);
        }
    }

    public void creatBookBorrowOrders() {
        //Kiểm tra thư viện có bạn đoc và sách chưa?

        boolean coBanDocHayChua = readerLogichandle.checkBanDocHayChua();

        boolean coSachHayChua = bookLogicHandle.checkCoSachHayChua();

        if(coBanDocHayChua || !coSachHayChua){
            System.out.println("chưa có đủ dữ liệu về bạn đọc và/hoặc sách. Vui lòng nhập thông tin bạn đohc và sách trước khi mượn");
            return;
        }


        System.out.print("Có bao nhiêu bạn đọc cần mượn sách: ");
        int readerNumber;
        while (true) {
            readerNumber = new Scanner(System.in).nextInt();
            if (readerNumber > 0 && readerNumber <= readerLogichandle.getReadersLength()) {
                break;
            }
            System.out.println("Số lượng bạn đọc không hợp lệ vui lòng nhập lại: ");
        }
        for (int i = 0; i < readerNumber; i++) {
            // Với từng bạn đọc, hỏi 3 câu trên
            System.out.println("Nhập thông tin id của bạn đọc thứ " + (i + 1));

            Reader reader = truyVanBanDoc();

            BookBorrowOrderDetail[]details = khaiBaoThongTinSachMuon();

            BookBorrowOrder order = new BookBorrowOrder(reader, details);
            // Lưu vào danh sách các lượt mượn
            saveOrder(order);
        }
    }
    public void saveOrder(BookBorrowOrder order){
        for (int j = 0; j < orders.length ; j++) {
            if (orders[j] != null){
                continue;
            }
            orders[j] = order;
            break;
        }
    }

    public BookBorrowOrderDetail[] khaiBaoThongTinSachMuon() {
        System.out.println("Bạn đọc này muốn mượn bao nhiêu đầu sách khác");
        int bookNumber = 0;
        while (true) {
            bookNumber = new Scanner(System.in).nextInt();{
                if (bookNumber > 0 && bookNumber <= bookLogicHandle.getBookLength()){
                    break;
                }
                System.out.println("Số lượng sách muốn mượn không hợp lệ, vui lòng nhập lại: ");
            }
        }
        BookBorrowOrderDetail[] details = new BookBorrowOrderDetail[bookNumber];
        int count = 0;
        for (int j = 0; j < bookNumber; j++) {
            System.out.println("Nhập id của đầu sách thứ " + (j+1) + ":");

            Book book = null;
            while (true){
                int bookId = new Scanner(System.in).nextInt();

                //Xác định xem id của sách kia có tồn tại trong thư viện không
                book = bookLogicHandle.searchBookById(bookId);

                if(book == null) {
                    break;
                }
                System.out.println("Không có sách nào khớp với id sách vừa nhập, vui lòng nhập lại: ");
            }

            System.out.println("Đầu sách " + book.getName() + "này bạn muon mượn bao nhiêu cuốn");
            int quantity = new Scanner(System.in).nextInt();
            BookBorrowOrderDetail detail = new BookBorrowOrderDetail(book,quantity);
            details[count] = detail;
            count++;
        }
        return details;
    }

    public Reader truyVanBanDoc(){
        Reader reader = null;
        while (true){
            int readerId = new Scanner(System.in).nextInt();
            // tìm xem trong thư viện có bạn đọc nào có id khớp với ID vừa nhập không
            reader = readerLogichandle.searchReaderById(readerId);
            if (reader != null) {
                break;
            }
            System.out.println("Không có bạn đọc nào mang mã vừa nhập, vui lòng nhập lại");
        }
        return reader;
    }

    public void searchByReaderName(){
        System.out.println("Nhập vào ten bạn đọc muốn tìm kiếm: ");
        String readerName = new Scanner(System.in).nextLine();
        for (int i = 0; i < orders.length; i++) {
            if ((orders[i] != null
                    && orders[i].getReader().getName().toLowerCase().contains(readerName.toLowerCase()))) {
                System.out.println(orders[i]);
            }
        }
    }

    public void sort(){
        while(true){
            System.out.println("1.Sắp xếp theo tên bạn đọc");
            System.out.println("2.Sắp xếp theo số lượng cuốn sách được mượn");
            System.out.println("3.Quay lại menu cha");
            System.out.println("Chọn đê: ");
            int functionChoice;
            while (true) {
                functionChoice = new Scanner(System.in).nextInt();
                if (functionChoice >= 1 && functionChoice <= 2) {
                    break;
                }
                System.out.println("Lựa chọn không hợp lệ, uui lòng nhập lại: ");
            }
            switch (functionChoice){
                case 1:
                    sortByReaderName();
                    printBookBorrowOrders();
                    break;
                case 2:
                    sortByBookQuantity();
                    printBookBorrowOrders();
                    break;
                case 3:
                    break;
            }
        }

    }

    private void sortByBookQuantity() {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                continue;
            }
            for (int j = 0; j < orders.length; j++) {
                if (orders[j] == null) {
                    continue;
                }

                if (orders[i].getTotalQuantity() > orders[j].getTotalQuantity()) {
                    BookBorrowOrder temp = orders[j];
                    orders[j] = orders[i];
                    orders[i] = temp;
                }
            }
        }

    }

    private void sortByReaderName() {
        for (int i = 0; i < orders.length; i++) {
            if(orders[i]==null){
                continue;
            }
            for (int j = 0; j < orders.length; j++) {
                if (orders[j] == null){
                    continue;
                }

//               if(orders[i].getReader().getName().toLowerCase()
//                        .compareTo(orders[j].getReader().getName().toLowerCase())>1) {
                String readerName1 = orders[i].getReader().getName().toLowerCase();
                String readerName2 = orders[j].getReader().getName().toLowerCase();
                /**
                 * Khi A compareTo B
                 * nếu kết quả là 1 số Dương thì A > B
                 * nếu kết quả là 1 số Âm thì A < B
                 * nếu kết quả là 0 là A = B
                 * Nam > Hải
                 * Lê < Lệ
                 */
                if (readerName1.compareTo(readerName2)>0){
                    BookBorrowOrder temp = orders[j];
                    orders[j] = orders[i];
                    orders[i] = temp;
                }
            }

        }
    }
}
