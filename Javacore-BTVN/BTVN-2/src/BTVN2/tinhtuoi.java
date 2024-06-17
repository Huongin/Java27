package BTVN2;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class tinhtuoi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap ngay-thang-nam sinh: " ); // ngày tháng năm cách bằng dấu cách
        int day = input.nextInt();
        int month = input.nextInt();
        int year = input.nextInt();

        //Nam hien tai
        int yearnow = Year.now().getValue();

        //Tinh tuoi hien tai
        int yearold = yearnow - year;
        System.out.println("Tuoi hien tai cua ban la: " + yearold);
    }
}
