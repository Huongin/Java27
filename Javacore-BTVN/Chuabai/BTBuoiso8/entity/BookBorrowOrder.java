package BTBuoiso8.entity;

import java.util.Arrays;

public class BookBorrowOrder {

    private Reader reader;
    private BookBorrowOrderDetail[] details;


    public BookBorrowOrder(Reader reader, BookBorrowOrderDetail[] details) {
        this.reader = reader;
        this.details = details;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public BookBorrowOrderDetail[] getDetails() {
        return details;
    }

    public void setDetails(BookBorrowOrderDetail[] details) {
        this.details = details;
    }

    public int getTotalQuantity(){
       int total = 0;
       for (BookBorrowOrderDetail detail : details){
           total += detail.getQuantity();
       }
       return total;
    }

    @Override
    public String toString() {
        return "BookBorrowOrder{" +
                "reader=" + reader +
                ", details=" + Arrays.toString(details) +
                '}';
    }
}
