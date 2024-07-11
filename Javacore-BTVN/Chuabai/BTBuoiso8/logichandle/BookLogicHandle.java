package BTBuoiso8.logichandle;

import BTBuoiso8.entity.Book;

import java.util.Scanner;

public class BookLogicHandle {

    private static Book[] books = new Book[1000]; //Đống sách trong thư viện

    public int getBookLegth(){
        return getBookLegth();
    }

    public static void printBook () {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                continue;
            }
            System.out.println(books[i]);
        }
    }


    public static void inputNewBook () {
        System.out.println("Nhập số lượng đầu sách muốn thêm mới");
        int bookNumber = new Scanner(System.in).nextInt();
        for (int i = 0; i < bookNumber; i++) {
            //nhập thông tin cho từng đầu sách và lưu vào đâu đó
            System.out.println("Nhập thông tin cho đầu sách thứ " + (i + 1));

            //Nhập thông tin cho từng đầu sách
            Book book = new Book();
            book.inputInfo();

            // Lưu vào mảng book
            saveBook(book);
        }
    }



    public static void saveBook (Book book){
        for (int j = 0; j < books.length; j++) {
            if (books[j] == null) {
                books[j] = book;
                break;
            }
        }
    }

    public boolean checkCoSachHayChua(){
        boolean coSachHayChua = false;
        for (int i = 0; i < books.length ; i++) {
            if(books[i] != null){
                coSachHayChua = true;
                break;
            }
        }
        return coSachHayChua;
    }

    public Book searchBookById(int bookId){
        for (int k = 0; k < books.length; k++) {
            if (books[k] != null && bookId == books[k].getId()) {
                return books[k];
            }
        }
        return null;
    }

    public int getBookLength() {
        return getBookLegth();
    }
}
