package BTVN2;

import java.util.Scanner;

public class tinhhinhchunhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap chieu rong hinh chu nhat a = ");
        float a = input.nextFloat();

        System.out.println("Nhap chieu dai hinh chu nhat b = ");
        float b = input.nextFloat();

        float C = (a +b) * 2;
        float S = a * b;
        System.out.println("Chu vi hinh chu nhat la: " + C);
        System.out.println("Dien tich hinh chu nhat la: " + S);
    }
}
