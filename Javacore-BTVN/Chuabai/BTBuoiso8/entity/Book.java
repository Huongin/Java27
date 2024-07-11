package BTBuoiso8.entity;

import BTBuoiso8.constant.BookSpeciallist;

import java.util.Scanner;

public class Book {

    private static int AUTO_ID = 10000;

    private int id;
    private String name;
    private String author;
    private BookSpeciallist bookSpeciallist;
    private int publishedYear;

    public Book() {
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BookSpeciallist getBookSpeciallist() {
        return bookSpeciallist;
    }

    public void setBookSpeciallist(BookSpeciallist bookSpeciallist) {
        this.bookSpeciallist = bookSpeciallist;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public void inputInfo(){
        System.out.println("Nhập tên sách");
        this.setName(new Scanner(System.in).nextLine());
        System.out.println("Nhập tác giả của sách");
        this.setAuthor(new Scanner(System.in).nextLine());
        System.out.println("Nhập năm xuất bản của sách");
        this.setPublishedYear(new Scanner(System.in).nextInt());
        System.out.println("Nhập chọn chuyên ngành của sách");
        System.out.println("1.Khoa học tự nhiên");
        System.out.println("2.Văn học - Nghệ thuật");
        System.out.println("3.Điện tử viễn thông");
        System.out.println("4.Công nghệ thông tin");
        int specialist;
        while (true) {
            specialist = new Scanner(System.in).nextInt();
            if(specialist >= 1 && specialist <= 4){
                break;
            }
            System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại: ");
        }
        switch (specialist) {
            case 1:
                this.setBookSpeciallist(BookSpeciallist.KHTN);
                break;
            case 2:
                this.setBookSpeciallist(BookSpeciallist.VHNT);
                break;
            case 3:
                this.setBookSpeciallist(BookSpeciallist.DTVT);
                break;
            case 4:
                this.setBookSpeciallist(BookSpeciallist.CNTT);
                break;
        }
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookSpeciallist=" + bookSpeciallist.getValue() +
                ", publishedYear=" + publishedYear +
                '}';
    }
}
