package BTBuoiso8;

import BTBuoiso8.entity.Book;
import BTBuoiso8.entity.BookBorrowOrder;
import BTBuoiso8.entity.BookBorrowOrderDetail;
import BTBuoiso8.entity.Reader;
import BTBuoiso8.logichandle.BookBorrowOrderLogichandle;
import BTBuoiso8.logichandle.BookLogicHandle;
import BTBuoiso8.logichandle.MenuLogichandle;
import BTBuoiso8.logichandle.ReaderLogichandle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuLogichandle menuLogichandle = new MenuLogichandle();
        menuLogichandle.menu();
    }
}

